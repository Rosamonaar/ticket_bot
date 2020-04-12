package bot.messageProcessing;

import bot.TelegramBot;
import bot.messageProcessing.commandProcessing.Commands;
import bot.messageProcessing.parameterProcessing.ParameterParser;
import bot.messageProcessing.parameterProcessing.ResponseGenerator;
import database.DatabaseWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.ArrayList;
import java.util.HashMap;

public class Handler implements Runnable {
    private static final Logger log = LoggerFactory.getLogger(Handler.class.getName());
    String command;
    String chatId;
    String message;
    TelegramBot bot;

    public Handler(String command, Update update, TelegramBot bot) {
        this.command = command;
        this.chatId = update.getMessage().getChatId().toString();
        this.message = update.getMessage().getText();
        this.bot = bot;
        new Thread(this).start();
    }

    public void run() {
        log.debug("[STARTED] Handler. Command: {}", command);
        String[] response = selectResponse(command, message);
        if (response != null) {
            for (String message : response) {
                addMessageInSendQueue(message, chatId, bot);
            }
        }
    }

    private String[] selectResponse(String command, String message) {
        if (command.equals(Commands.START.toString())) {
            return new String[] {ResponseGenerator.getStartResponse()};
        } else if (command.equals(Commands.HELP.toString())) {
            return new String[] {ResponseGenerator.getHelpResponse()};
        } else if (command.equals(Commands.NONE.toString())) {
            return new String[] {ResponseGenerator.getNoneResponse()};
        } else if (command.equals(Commands.TABLE.toString())) {
            ArrayList<String> result = new ResponseGenerator().generate(message);
            if (!result.isEmpty()) {
                String[] response = new String[20];
                for (int i = 0; i < (result.size()/10 + 1); i++) {
                    StringBuilder stringBuilder = new StringBuilder();
                    for (int j = i * 10; j < ((i+1) * 10) && j < result.size(); j++) {
                        stringBuilder.append(result.get(j));
                    }
                    response[i] = stringBuilder.toString();
                }
                return response;
            } else
                return new String[] {ResponseGenerator.getNoAvailableRoutes()};
        }
        return null;
    }

    private void addMessageInSendQueue(String response, String chatId, TelegramBot bot) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(response);
        bot.sendQueue.add(message);
        log.debug("New message add in send queue: {}", response);
    }

}
