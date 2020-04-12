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
    "regions",
    "codes",
    "title"
})
public class Country {

    @JsonProperty("regions")
    private List<Region> regions = new ArrayList<Region>();
    @JsonProperty("codes")
    private Codes_____ codes;
    @JsonProperty("title")
    private String title;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("regions")
    public List<Region> getRegions() {
        return regions;
    }

    @JsonProperty("regions")
    public void setRegions(List<Region> regions) {
        this.regions = regions;
    }

    public Country withRegions(List<Region> regions) {
        this.regions = regions;
        return this;
    }

    @JsonProperty("codes")
    public Codes_____ getCodes() {
        return codes;
    }

    @JsonProperty("codes")
    public void setCodes(Codes_____ codes) {
        this.codes = codes;
    }

    public Country withCodes(Codes_____ codes) {
        this.codes = codes;
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

    public Country withTitle(String title) {
        this.title = title;
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
