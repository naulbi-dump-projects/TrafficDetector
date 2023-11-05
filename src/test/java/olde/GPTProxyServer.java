package olde;

import com.sun.net.httpserver.HttpsServer;
import com.sun.net.httpserver.HttpsConfigurator;
import com.sun.net.httpserver.HttpsParameters;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;

public class GPTProxyServer {
    public static void main(String[] args) throws Exception {
        // Создаем SSL-контекст для HTTPS
        SSLContext sslContext = SSLContext.getDefault();

        // Создаем конфигуратор для SSL
        HttpsConfigurator configurator = new HttpsConfigurator(sslContext) {
            public void configure(HttpsParameters params) {
                System.out.println("configure(HttpsParametrs)");
                SSLContext context = getSSLContext();
                SSLParameters sslParams = context.getSupportedSSLParameters();
                params.setSSLParameters(sslParams);
            }
        };

        // Создаем HTTPS-сервер на порту 8443 с указанным SSL-контекстом
        HttpsServer server = HttpsServer.create(new InetSocketAddress(8080), 0);
        server.setHttpsConfigurator(configurator);

        // Создаем контекст для обработки всех запросов
        server.createContext("/", new ProxyHandler());

        // Запускаем сервер
        server.start();
        System.out.println("Прокси-сервер запущен на порту 8443");
    }

    static class ProxyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            try {
                System.out.println("handle(HttpExchange)");

                // Получаем URI из запроса
                URI uri = exchange.getRequestURI();

                // Создаем HTTP-клиент
                HttpClient httpClient = HttpClient.newBuilder().build();

                // Создаем HTTP-запрос к запрошенному URI
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(uri)
                        .header("User-Agent", "ProxyServer")
                        .build();

                // Отправляем запрос и получаем ответ
                HttpResponse<InputStream> response = httpClient.send(request, HttpResponse.BodyHandlers.ofInputStream());

                // Получаем код ответа
                int responseCode = response.statusCode();

                // Отправляем код ответа и заголовки клиенту
                exchange.sendResponseHeaders(responseCode, 0);

                // Получаем тело ответа
                InputStream responseStream = response.body();

                // Отправляем тело ответа клиенту
                OutputStream os = exchange.getResponseBody();
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = responseStream.read(buffer)) != -1) {
                    os.write(buffer, 0, bytesRead);
                }

                // Закрываем потоки
                os.close();
                responseStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
