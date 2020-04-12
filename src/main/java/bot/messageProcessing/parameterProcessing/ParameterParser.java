package bot.messageProcessing.parameterProcessing;


import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParameterParser {

    public HashMap<String, String> getParameters(String message) {
        HashMap<String, String> parameters = new HashMap<>();
        parameters.put("date", getValidDate(message));
        message = deleteParameterFromMessage(message, "date");
        message = message.toLowerCase();
        if ((getTransport(message)) != null) {
            parameters.put("transport", getTransport(message));
            message = deleteParameterFromMessage(message, "transport");
        }
        parameters.put("from", getCities(message)[0]);
        parameters.put("to", getCities(message)[1]);
        return parameters;
    }

    private String getValidDate(String message) {
        String date = getDate(message);
        return date.substring(6) + "-" + date.substring(3, 5) + "-" + date.substring(0, 2);
    }

    private String getDate(String message) {
        Pattern pattern = Pattern.compile("\\d{2}[-.,/]\\d{2}[-.,/]\\d{4}");
        Matcher matcher = pattern.matcher(message);
        int dateStart = 0, dateEnd = 0;
        while (matcher.find()) {
            dateStart = matcher.start();
            dateEnd = matcher.end();
        }
        return message.substring(dateStart, dateEnd);
    }

    private String getTransport(String message) {
        if (message.contains("самолет") || message.contains("самолёт"))
            return "plane";
        if (message.contains("поезд"))
            return "train";
        return null;
    }

    private String[] getCities(String message) {
        return message.split(" - ");
    }

    private String deleteParameterFromMessage(String message, String parameterName) {
        String parameter = "";
        if (parameterName.equals("date"))
            parameter = getDate(message);
        if (parameterName.equals("transport")) {
            if (message.contains("самолет"))
                parameter = "самолет";
            if (message.contains("самолёт"))
                parameter = "самолёт";
            if (message.contains("поезд"))
                parameter = "поезд";
        }
        return message.replace(parameter, "").trim();
    }
}
