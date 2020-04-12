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
    "cents",
    "whole"
})
public class Price_ {

    @JsonProperty("cents")
    private Integer cents;
    @JsonProperty("whole")
    private Integer whole;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cents")
    public Integer getCents() {
        return cents;
    }

    @JsonProperty("cents")
    public void setCents(Integer cents) {
        this.cents = cents;
    }

    public Price_ withCents(Integer cents) {
        this.cents = cents;
        return this;
    }

    @JsonProperty("whole")
    public Integer getWhole() {
        return whole;
    }

    @JsonProperty("whole")
    public void setWhole(Integer whole) {
        this.whole = whole;
    }

    public Price_ withWhole(Integer whole) {
        this.whole = whole;
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
