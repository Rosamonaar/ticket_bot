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
    "direction",
    "codes",
    "station_type",
    "title",
    "longitude",
    "transport_type",
    "latitude"
})
public class Station {

    @JsonProperty("direction")
    private String direction;
    @JsonProperty("codes")
    private Codes___ codes;
    @JsonProperty("station_type")
    private String stationType;
    @JsonProperty("title")
    private String title;
    @JsonProperty("longitude")
    private Double longitude;
    @JsonProperty("transport_type")
    private String transportType;
    @JsonProperty("latitude")
    private Double latitude;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Station withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    @JsonProperty("codes")
    public Codes___ getCodes() {
        return codes;
    }

    @JsonProperty("codes")
    public void setCodes(Codes___ codes) {
        this.codes = codes;
    }

    public Station withCodes(Codes___ codes) {
        this.codes = codes;
        return this;
    }

    @JsonProperty("station_type")
    public String getStationType() {
        return stationType;
    }

    @JsonProperty("station_type")
    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public Station withStationType(String stationType) {
        this.stationType = stationType;
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

    public Station withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Station withLongitude(Double longitude) {
        this.longitude = longitude;
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

    public Station withTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    @JsonProperty("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Station withLatitude(Double latitude) {
        this.latitude = latitude;
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
