package bot.messageProcessing;

import bot.TelegramBot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MessageSender implements Runnable {
    //обработчик очереди сообщений, которые нужно отправить пользователю

    private static final Logger log = LoggerFactory.getLogger(MessageSender.class.getName());
    private final TelegramBot bot;

    public MessageSender(TelegramBot bot) {
        this.bot = bot;
    }

    @Override
    public void run() {
        log.info("[STARTED] MsgSender");
        while(true) {
            for (SendMessage message = bot.sendQueue.poll(); message != null; message = bot.sendQueue.poll()) {
                log.debug("Get new msg to send: {}", message.getText());
                try {
                    bot.execute(message);
                } catch (TelegramApiException e) {
                    log.error(e.getMessage());
                }
            }
        }
    }
}
