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
    "code",
    "title",
    "popular_title",
    "short_title",
    "transport_type",
    "type",
    "station_type",
    "station_type_name"
})
public class From {

    @JsonProperty("code")
    private String code;
    @JsonProperty("title")
    private String title;
    @JsonProperty("popular_title")
    private String popularTitle;
    @JsonProperty("short_title")
    private String shortTitle;
    @JsonProperty("transport_type")
    private String transportType;
    @JsonProperty("type")
    private String type;
    @JsonProperty("station_type")
    private String stationType;
    @JsonProperty("station_type_name")
    private String stationTypeName;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public From withCode(String code) {
        this.code = code;
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

    public From withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("popular_title")
    public String getPopularTitle() {
        return popularTitle;
    }

    @JsonProperty("popular_title")
    public void setPopularTitle(String popularTitle) {
        this.popularTitle = popularTitle;
    }

    public From withPopularTitle(String popularTitle) {
        this.popularTitle = popularTitle;
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

    public From withShortTitle(String shortTitle) {
        this.shortTitle = shortTitle;
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

    public From withTransportType(String transportType) {
        this.transportType = transportType;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public From withType(String type) {
        this.type = type;
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

    public From withStationType(String stationType) {
        this.stationType = stationType;
        return this;
    }

    @JsonProperty("station_type_name")
    public String getStationTypeName() {
        return stationTypeName;
    }

    @JsonProperty("station_type_name")
    public void setStationTypeName(String stationTypeName) {
        this.stationTypeName = stationTypeName;
    }

    public From withStationTypeName(String stationTypeName) {
        this.stationTypeName = stationTypeName;
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
