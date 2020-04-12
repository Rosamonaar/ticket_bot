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
    "date",
    "to",
    "from"
})
public class Search {

    @JsonProperty("date")
    private String date;
    @JsonProperty("to")
    private To__ to;
    @JsonProperty("from")
    private From__ from;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    public Search withDate(String date) {
        this.date = date;
        return this;
    }

    @JsonProperty("to")
    public To__ getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(To__ to) {
        this.to = to;
    }

    public Search withTo(To__ to) {
        this.to = to;
        return this;
    }

    @JsonProperty("from")
    public From__ getFrom() {
        return from;
    }

    @JsonProperty("from")
    public void setFrom(From__ from) {
        this.from = from;
    }

    public Search withFrom(From__ from) {
        this.from = from;
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
