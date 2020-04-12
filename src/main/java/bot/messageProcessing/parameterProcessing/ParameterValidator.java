package bot.messageProcessing.parameterProcessing;

import java.util.regex.Pattern;

public class ParameterValidator {

    public boolean isValidParameters(String message) {
        return containsValidDate(message) && containsValidCity(message);
    }

    private boolean containsValidDate(String message) {
        return Pattern.compile("\\d{2}[-.,/]\\d{2}[-.,/]\\d{4}").matcher(message).find();
    }

    private boolean containsValidCity(String message) {
        return message.split(" - ").length == 2;
    }
}
