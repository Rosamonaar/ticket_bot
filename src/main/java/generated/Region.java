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
    "settlements",
    "codes",
    "title"
})
public class Region {

    @JsonProperty("settlements")
    private List<Settlement> settlements = new ArrayList<Settlement>();
    @JsonProperty("codes")
    private Codes____ codes;
    @JsonProperty("title")
    private String title;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("settlements")
    public List<Settlement> getSettlements() {
        return settlements;
    }

    @JsonProperty("settlements")
    public void setSettlements(List<Settlement> settlements) {
        this.settlements = settlements;
    }

    public Region withSettlements(List<Settlement> settlements) {
        this.settlements = settlements;
        return this;
    }

    @JsonProperty("codes")
    public Codes____ getCodes() {
        return codes;
    }

    @JsonProperty("codes")
    public void setCodes(Codes____ codes) {
        this.codes = codes;
    }

    public Region withCodes(Codes____ codes) {
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

    public Region withTitle(String title) {
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
