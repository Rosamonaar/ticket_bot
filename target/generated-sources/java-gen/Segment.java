import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "arrival",
    "from",
    "thread",
    "departure_platform",
    "departure",
    "stops",
    "departure_terminal",
    "to",
    "has_transfers",
    "tickets_info",
    "duration",
    "arrival_terminal",
    "start_date",
    "arrival_platform"
})
public class Segment {

    @JsonProperty("arrival")
    private String arrival;
    @JsonProperty("from")
    private From_ from;
    @JsonProperty("thread")
    private Thread_ thread;
    @JsonProperty("departure_platform")
    private String departurePlatform;
    @JsonProperty("departure")
    private String departure;
    @JsonProperty("stops")
    private String stops;
    @JsonProperty("departure_terminal")
    private Object departureTerminal;
    @JsonProperty("to")
    private To_ to;
    @JsonProperty("has_transfers")
    private Boolean hasTransfers;
    @JsonProperty("tickets_info")
    private TicketsInfo_ ticketsInfo;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("arrival_terminal")
    private String arrivalTerminal;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("arrival_platform")
    private String arrivalPlatform;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("arrival")
    public String getArrival() {
        return arrival;
    }

    @JsonProperty("arrival")
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public Segment withArrival(String arrival) {
        this.arrival = arrival;
        return this;
    }

    @JsonProperty("from")
    public From_ getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From_ from) {
        this.from = from;
    }

    public Segment withFrom(From_ from) {
        this.from = from;
        return this;
    }

    @JsonProperty("thread")
    public Thread_ getThread() {
        return thread;
    }

    @JsonProperty("thread")
    public void setThread(Thread_ thread) {
        this.thread = thread;
    }

    public Segment withThread(Thread_ thread) {
        this.thread = thread;
        return this;
    }

    @JsonProperty("departure_platform")
    public String getDeparturePlatform() {
        return departurePlatform;
    }

    @JsonProperty("departure_platform")
    public void setDeparturePlatform(String departurePlatform) {
        this.departurePlatform = departurePlatform;
    }

    public Segment withDeparturePlatform(String departurePlatform) {
        this.departurePlatform = departurePlatform;
        return this;
    }

    @JsonProperty("departure")
    public String getDeparture() {
        return departure;
    }

    @JsonProperty("departure")
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public Segment withDeparture(String departure) {
        this.departure = departure;
        return this;
    }

    @JsonProperty("stops")
    public String getStops() {
        return stops;
    }

    @JsonProperty("stops")
    public void setStops(String stops) {
        this.stops = stops;
    }

    public Segment withStops(String stops) {
        this.stops = stops;
        return this;
    }

    @JsonProperty("departure_terminal")
    public Object getDepartureTerminal() {
        return departureTerminal;
    }

    @JsonProperty("departure_terminal")
    public void setDepartureTerminal(Object departureTerminal) {
        this.departureTerminal = departureTerminal;
    }

    public Segment withDepartureTerminal(Object departureTerminal) {
        this.departureTerminal = departureTerminal;
        return this;
    }

    @JsonProperty("to")
    public To_ getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(To_ to) {
        this.to = to;
    }

    public Segment withTo(To_ to) {
        this.to = to;
        return this;
    }

    @JsonProperty("has_transfers")
    public Boolean getHasTransfers() {
        return hasTransfers;
    }

    @JsonProperty("has_transfers")
    public void setHasTransfers(Boolean hasTransfers) {
        this.hasTransfers = hasTransfers;
    }

    public Segment withHasTransfers(Boolean hasTransfers) {
        this.hasTransfers = hasTransfers;
        return this;
    }

    @JsonProperty("tickets_info")
    public TicketsInfo_ getTicketsInfo() {
        return ticketsInfo;
    }

    @JsonProperty("tickets_info")
    public void setTicketsInfo(TicketsInfo_ ticketsInfo) {
        this.ticketsInfo = ticketsInfo;
    }

    public Segment withTicketsInfo(TicketsInfo_ ticketsInfo) {
        this.ticketsInfo = ticketsInfo;
        return this;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Segment withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    @JsonProperty("arrival_terminal")
    public String getArrivalTerminal() {
        return arrivalTerminal;
    }

    @JsonProperty("arrival_terminal")
    public void setArrivalTerminal(String arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
    }

    public Segment withArrivalTerminal(String arrivalTerminal) {
        this.arrivalTerminal = arrivalTerminal;
        return this;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Segment withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("arrival_platform")
    public String getArrivalPlatform() {
        return arrivalPlatform;
    }

    @JsonProperty("arrival_platform")
    public void setArrivalPlatform(String arrivalPlatform) {
        this.arrivalPlatform = arrivalPlatform;
    }

    public Segment withArrivalPlatform(String arrivalPlatform) {
        this.arrivalPlatform = arrivalPlatform;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
