package bot.messageProcessing;

import bot.TelegramBot;
import bot.messageProcessing.commandProcessing.CommandParser;
import bot.messageProcessing.commandProcessing.Commands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.api.objects.Update;

public class MessageReceiver implements Runnable{
    //обработчик полученных сообщений

    private static final Logger log = LoggerFactory.getLogger(MessageReceiver.class.getName());

    private TelegramBot bot;
    public MessageReceiver(TelegramBot bot) {
        this.bot = bot;
    }

    public void run() {
        log.info("[STARTED] MsgReceiver");
        while (true) {
            for (Update update = bot.receiveQueue.poll(); update != null; update = bot.receiveQueue.poll()) {
                log.debug("New command for receive in queue: {}", update.getMessage().getText());
                String command = null;
                if (update.getMessage().hasText()) {
                    command = new CommandParser(bot).parse(update.getMessage().getText());
                }
                if (command != null)
                    new Handler(command, update, bot);
            }
        }
    }
}
