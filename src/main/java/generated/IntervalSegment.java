package generated;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "from",
    "thread",
    "departure_platform",
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
public class IntervalSegment {

    @JsonProperty("from")
    private From from;
    @JsonProperty("thread")
    private Thread thread;
    @JsonProperty("departure_platform")
    private String departurePlatform;
    @JsonProperty("stops")
    private String stops;
    @JsonProperty("departure_terminal")
    private Object departureTerminal;
    @JsonProperty("to")
    private To to;
    @JsonProperty("has_transfers")
    private Boolean hasTransfers;
    @JsonProperty("tickets_info")
    private TicketsInfo ticketsInfo;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("arrival_terminal")
    private String arrivalTerminal;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("arrival_platform")
    private String arrivalPlatform;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("from")
    public From getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From from) {
        this.from = from;
    }

    public IntervalSegment withFrom(From from) {
        this.from = from;
        return this;
    }

    @JsonProperty("thread")
    public Thread getThread() {
        return thread;
    }

    @JsonProperty("thread")
    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public IntervalSegment withThread(Thread thread) {
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

    public IntervalSegment withDeparturePlatform(String departurePlatform) {
        this.departurePlatform = departurePlatform;
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

    public IntervalSegment withStops(String stops) {
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

    public IntervalSegment withDepartureTerminal(Object departureTerminal) {
        this.departureTerminal = departureTerminal;
        return this;
    }

    @JsonProperty("to")
    public To getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(To to) {
        this.to = to;
    }

    public IntervalSegment withTo(To to) {
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

    public IntervalSegment withHasTransfers(Boolean hasTransfers) {
        this.hasTransfers = hasTransfers;
        return this;
    }

    @JsonProperty("tickets_info")
    public TicketsInfo getTicketsInfo() {
        return ticketsInfo;
    }

    @JsonProperty("tickets_info")
    public void setTicketsInfo(TicketsInfo ticketsInfo) {
        this.ticketsInfo = ticketsInfo;
    }

    public IntervalSegment withTicketsInfo(TicketsInfo ticketsInfo) {
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

    public IntervalSegment withDuration(Integer duration) {
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

    public IntervalSegment withArrivalTerminal(String arrivalTerminal) {
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

    public IntervalSegment withStartDate(String startDate) {
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

    public IntervalSegment withArrivalPlatform(String arrivalPlatform) {
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
