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
    "uid",
    "title",
    "interval",
    "number",
    "short_title",
    "thread_method_link",
    "carrier",
    "transport_type",
    "vehicle",
    "transport_subtype",
    "express_type"
})
public class Thread {

    @JsonProperty("uid")
    private String uid;
    @JsonProperty("title")
    private String title;
    @JsonProperty("interval")
    private Interval interval;
    @JsonProperty("number")
    private String number;
    @JsonProperty("short_title")
    private String shortTitle;
    @JsonProperty("thread_method_link")
    private String threadMethodLink;
    @JsonProperty("carrier")
    private Carrier carrier;
    @JsonProperty("transport_type")
    private String transportType;
    @JsonProperty("vehicle")
    private String vehicle;
    @JsonProperty("transport_subtype")
    private TransportSubtype transportSubtype;
    @JsonProperty("express_type")
    private Object expressType;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    public Thread withUid(String uid) {
        this.uid = uid;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Thread withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("interval")
    public Interval getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(Interval interval) {
        this.interval = interval;
    }

    public Thread withInterval(Interval interval) {
        this.interval = interval;
        return this;
    }

    @JsonProperty("number")
    public String getNumber() {
        return number;
    }

    @JsonProperty("number")
    public void setNumber(String number) {
        this.number = number;
    }

    public Thread withNumber(String number) {
        this.number = number;
        return this;
    }

    @JsonProperty("short_title")
    public String getShortTitle() {
        return shortTitle;
    }

    @JsonProperty("short_title")
    public void setShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
    }

    public Thread withShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
        return this;
    }

    @JsonProperty("thread_method_link")
    public String getThreadMethodLink() {
        return threadMethodLink;
    }

    @JsonProperty("thread_method_link")
    public void setThreadMethodLink(String threadMethodLink) {
        this.threadMethodLink = threadMethodLink;
    }

    public Thread withThreadMethodLink(String threadMethodLink) {
        this.threadMethodLink = threadMethodLink;
        return this;
    }

    @JsonProperty("carrier")
    public Carrier getCarrier() {
        return carrier;
    }

    @JsonProperty("carrier")
    public void setCarrier(Carrier carrier) {
        this.carrier = carrier;
    }

    public Thread withCarrier(Carrier carrier) {
        this.carrier = carrier;
        return this;
    }

    @JsonProperty("transport_type")
    public String getTransportType() {
        return transportType;
    }

    @JsonProperty("transport_type")
    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public Thread withTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    @JsonProperty("vehicle")
    public String getVehicle() {
        return vehicle;
    }

    @JsonProperty("vehicle")
    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public Thread withVehicle(String vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    @JsonProperty("transport_subtype")
    public TransportSubtype getTransportSubtype() {
        return transportSubtype;
    }

    @JsonProperty("transport_subtype")
    public void setTransportSubtype(TransportSubtype transportSubtype) {
        this.transportSubtype = transportSubtype;
    }

    public Thread withTransportSubtype(TransportSubtype transportSubtype) {
        this.transportSubtype = transportSubtype;
        return this;
    }

    @JsonProperty("express_type")
    public Object getExpressType() {
        return expressType;
    }

    @JsonProperty("express_type")
    public void setExpressType(Object expressType) {
        this.expressType = expressType;
    }

    public Thread withExpressType(Object expressType) {
        this.expressType = expressType;
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
