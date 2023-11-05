package olde;

import com.github.tomakehurst.wiremock.WireMockServer;
import static com.github.tomakehurst.wiremock.client.WireMock.*;


public class Wiremock {
    public static void main(String[] args) {
        // Создание инстанса WireMock-сервера
        WireMockServer wireMockServer = new WireMockServer();

        // Запуск сервера
        wireMockServer.start();

        // Настройка перехвата запросов к домену "oauth.vk.com"
        stubFor(any(urlPathEqualTo("/customers")).willReturn(aResponse().withStatus(200).withBody("Response body goes here")));
        stubFor(any(urlMatching(".*oauth.vk.com.*"))
                .willReturn(aResponse().withStatus(200)
                        .withBody("Response body goes here")));

        // Ожидание запросов и обработка их настроенным образом

        // Завершение работы сервера
        //wireMockServer.stop();

    }
}
