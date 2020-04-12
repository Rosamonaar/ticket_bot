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
    "yandex_code"
})
public class Codes____ {

    @JsonProperty("yandex_code")
    private String yandexCode;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("yandex_code")
    public String getYandexCode() {
        return yandexCode;
    }

    @JsonProperty("yandex_code")
    public void setYandexCode(String yandexCode) {
        this.yandexCode = yandexCode;
    }

    public Codes____ withYandexCode(String yandexCode) {
        this.yandexCode = yandexCode;
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
