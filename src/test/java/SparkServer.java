import static spark.Spark.*;

public class SparkServer {
    public static void main(String[] args) {

        // Установка порта веб-сервера
        port(17177);



        // Обработка запросов
        get("/oauth/", (req, res) -> {
            System.out.println("REQUEST!");
            req.params().forEach((val, val2) -> System.out.println(val + ":" + val2));
            String playerId = req.params("playerId");
            // Здесь вы можете выполнить необходимые операции для получения данных о матчах игрока из базы данных

            // Пример возврата данных в формате JSON
            res.type("application/json");
            return "{ \"playerId\": \"" + playerId + "\" }";
        });
    }
}
