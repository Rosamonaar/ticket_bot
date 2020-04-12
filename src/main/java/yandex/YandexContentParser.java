package yandex;

import generated.AvailableTransport;
import generated.Segment;

import java.util.ArrayList;

public class YandexContentParser {

    public ArrayList<String> parse(AvailableTransport availableTransport) {
        ArrayList<String> routes = new ArrayList<>();
        for (Segment s : availableTransport.getSegments()) {
            String transport = s.getFrom().getTransportType();
            if (transport.equals("train"))
                transport = "Поезд";
            else if (transport.equals("plane"))
                transport = "Самолет";
            routes.add((String.format("%n%s %s%n%s - %s%nотправление %s, прибытие %s%n", transport, s.getThread().getNumber(),
                    s.getFrom().getTitle(), s.getTo().getTitle(), s.getDeparture().substring(11, 16), s.getArrival().substring(11,16))));
        }
        return routes;
    }
}
