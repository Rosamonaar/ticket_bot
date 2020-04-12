package bot.messageProcessing.commandProcessing;

import bot.TelegramBot;
import bot.messageProcessing.parameterProcessing.ParameterValidator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CommandParser {
    private static final Logger log = LoggerFactory.getLogger(CommandParser.class.getName());
    private final String botName;

    public CommandParser(TelegramBot bot) {
        botName = bot.getBotUsername();
    }

    public String parse(String message) {
        if (message != null)
            message = message.trim();
        else
            return Commands.NONE.toString();
        if (new ParameterValidator().isValidParameters(message)) {
            return Commands.TABLE.toString();
        }
        if (message.equals("") || !isCommand(message) || !isCommandForMe(message))
            return Commands.NONE.toString();
        String command = getCommandFromMessage(message);
        try {
            return Commands.valueOf(command).toString();
        } catch (IllegalArgumentException e) {
            log.debug("Can't  parse command: {}", command);
            return Commands.NONE.toString();
        }
    }

    private String getCommandFromMessage(String message) {
        if (message.contains("_")) {
            int indexOfUnderline = message.indexOf("_");
            return message.substring(1, indexOfUnderline).toUpperCase();
        }
        return message.substring(1).toUpperCase();
    }

    private boolean isCommand(String message) {
        return message.startsWith("/");
    }

    private boolean isCommandForMe(String message) {
        if (message.contains("@")) {
            String botNameForEqual = message.substring(message.indexOf("@") + 1);
            return botName.equals(botNameForEqual);
        }
        return true;
    }
}
