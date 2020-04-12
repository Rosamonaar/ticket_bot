package bot;

import bot.messageProcessing.MessageReceiver;
import bot.messageProcessing.MessageSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class BotStarter {

    private static final Logger log = LoggerFactory.getLogger(BotStarter.class.getName());
    private static final int RECONNECT_PAUSE = 5000;

    public static void main(String[] args) {
        ApiContextInitializer.init();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
        TelegramBot bot = new TelegramBot();
        for (boolean isConnected = false; !isConnected; ) {
            try {
                telegramBotsApi.registerBot(bot);
                log.info("[STARTED] Bot connected.");
                threadsStarter(bot);
                isConnected = true;
            } catch (TelegramApiRequestException e) {
                log.error("Bot can't connect. Error: {}", e.getMessage());
                try {
                    Thread.sleep(RECONNECT_PAUSE);
                } catch (InterruptedException ex) {
                    log.error(ex.getMessage());
                }
            }
        }
    }

    private static void threadsStarter(TelegramBot bot) {
        Thread receiver = new Thread(new MessageReceiver(bot));
        receiver.setDaemon(true);
        receiver.setName("MsgReceiver");
        receiver.start();

        Thread sender = new Thread(new MessageSender(bot));
        sender.setDaemon(true);
        sender.setName("MsgSender");
        sender.start();
    }
}
