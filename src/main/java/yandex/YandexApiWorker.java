package yandex;

import com.fasterxml.jackson.databind.ObjectMapper;
import generated.AvailableTransport;
import org.apache.http.Header;
import org.apache.http.client.fluent.Content;
import org.apache.http.client.fluent.Request;
import org.apache.http.message.BasicHeader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

public class YandexApiWorker {
    private static final Logger log = LoggerFactory.getLogger(YandexApiWorker.class.getName());
    private final String yandexApiKey = "7da3cfdd-e81a-43fe-bb95-e7e228013eff";
    private final String yandexUrl = "https://api.rasp.yandex.net/v3.0/search/?";
    private final Header header = new BasicHeader("Authorization", yandexApiKey);

    public ArrayList<String> getVariants(ArrayList<String> fromList, ArrayList<String> toList, String date, String transport) {
        AvailableTransport availableTransport;
        ArrayList<String> routes = new ArrayList<>();
        for (String from : fromList) {
            for (String to : toList) {
                Content contentFromYandex = getContentFromYandex(from, to, date, transport);
                if (contentFromYandex != null) {
                    try {
                        availableTransport = new ObjectMapper().readValue(contentFromYandex.asString(), AvailableTransport.class);
                        routes.addAll(new YandexContentParser().parse(availableTransport));
                    } catch (IOException e) {
                        log.error(e.getMessage());
                    }
                }
            }
        }
        return routes;
    }

    private Content getContentFromYandex(String from, String to, String date, String transport) {
        String fullUrl;
        if (transport != null)
            fullUrl = String.format("%sfrom=%s&to=%s&date=%s&transport_types=%s", yandexUrl, from, to, date, transport);
        else
            fullUrl = String.format("%sfrom=%s&to=%s&date=%s", yandexUrl, from, to, date);
        try {
            log.debug("Sent request with parameters {}, {}, {}", from, to, date);
            return Request.Get(fullUrl).addHeader(header).execute().returnContent();
        } catch (IOException e) {
            log.error(e.getMessage());
            return null;
        }
    }
}
