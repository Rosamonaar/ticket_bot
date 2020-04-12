package bot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class TelegramBot extends TelegramLongPollingBot {

    private static final Logger log = LoggerFactory.getLogger(TelegramBot.class.getName());
    public final Queue<SendMessage> sendQueue = new ConcurrentLinkedQueue<>(); //очередь сообщений для отправки
    public final Queue<Update> receiveQueue = new ConcurrentLinkedQueue<>();   //очередь принятых сообщений

    public void onUpdateReceived(Update update) {
        log.debug("Receive new Update: {}", update.getMessage().getText());
        receiveQueue.add(update);
    }

    public String getBotUsername() {
        return "TransportInfoBot";
    }

    public String getBotToken() {
        return "1097739548:AAEgO1OpNPotzde0v_vEZmJhRSQysAq8V1I";
    }
}
