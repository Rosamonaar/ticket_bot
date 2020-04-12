package generated;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "et_marker",
    "places"
})
public class TicketsInfo_ {

    @JsonProperty("et_marker")
    private Boolean etMarker;
    @JsonProperty("places")
    private List<Place_> places = new ArrayList<Place_>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("et_marker")
    public Boolean getEtMarker() {
        return etMarker;
    }

    @JsonProperty("et_marker")
    public void setEtMarker(Boolean etMarker) {
        this.etMarker = etMarker;
    }

    public TicketsInfo_ withEtMarker(Boolean etMarker) {
        this.etMarker = etMarker;
        return this;
    }

    @JsonProperty("places")
    public List<Place_> getPlaces() {
        return places;
    }

    @JsonProperty("places")
    public void setPlaces(List<Place_> places) {
        this.places = places;
    }

    public TicketsInfo_ withPlaces(List<Place_> places) {
        this.places = places;
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
