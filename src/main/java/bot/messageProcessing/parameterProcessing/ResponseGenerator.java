package bot.messageProcessing.parameterProcessing;


import database.DatabaseWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import yandex.YandexApiWorker;

import java.util.ArrayList;
import java.util.HashMap;

public class ResponseGenerator {
    private static final Logger log = LoggerFactory.getLogger(ResponseGenerator.class.getName());

    private static final String noAvailableRoutes = "Нет прямых рейсов";
    private static final String noneResponse = "Неверный формат команды";
    private static final String startResponse = String.format("Привет, я могу подсказать, как добраться из одного места в другое%nВызови команду /help для получения инструкции");
    private static final String helpResponse = String.format("Отправь команду формата%nоткуда - куда дата транспорт%n%nНапример:%nМосква - Тула 25.05.2020 поезд%n%n" +
            "Код транспорта может быть поезд или самолет, либо можно вообще его не писать, тогда в ответе будут и поезда и самолеты \u263a");

    public static String getNoAvailableRoutes() {
        return noAvailableRoutes;
    }

    public static String getNoneResponse() {
        return noneResponse;
    }

    public static String getStartResponse() {
        return startResponse;
    }

    public static String getHelpResponse() {
        return helpResponse;
    }



    public ArrayList<String> generate(String message) {
        log.debug("Try generate new response for message {}", message);
        HashMap<String, String> parameters = new ParameterParser().getParameters(message);
        ArrayList<String> routes = new ArrayList<>();;
        if (!parameters.isEmpty()) {
            DatabaseWorker databaseWorker = new DatabaseWorker();
            ArrayList<String> fromList;
            ArrayList<String> toList;
            String transport = null;
            if (parameters.containsKey("transport")) {
                transport = parameters.get("transport");
                fromList = databaseWorker.getCodes(parameters.get("from"), transport);
                toList = databaseWorker.getCodes(parameters.get("to"), transport);
            } else {
                fromList = databaseWorker.getCodes(parameters.get("from"));
                toList = databaseWorker.getCodes(parameters.get("to"));
            }
            if (fromList.isEmpty()) {
                routes.add(String.format("Пункт отправления %s неверен", parameters.get("from")));
                return routes;
            }

            if (toList.isEmpty()) {
                routes.add(String.format("Пункт прибытия %s неверен", parameters.get("to")));
                return routes;
            }
            routes = new YandexApiWorker().getVariants(fromList, toList, parameters.get("date"), transport);
        }
        return routes;
    }

}
