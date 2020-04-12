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
    "density",
    "end_time",
    "begin_time"
})
public class Interval {

    @JsonProperty("density")
    private String density;
    @JsonProperty("end_time")
    private String endTime;
    @JsonProperty("begin_time")
    private String beginTime;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("density")
    public String getDensity() {
        return density;
    }

    @JsonProperty("density")
    public void setDensity(String density) {
        this.density = density;
    }

    public Interval withDensity(String density) {
        this.density = density;
        return this;
    }

    @JsonProperty("end_time")
    public String getEndTime() {
        return endTime;
    }

    @JsonProperty("end_time")
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Interval withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    @JsonProperty("begin_time")
    public String getBeginTime() {
        return beginTime;
    }

    @JsonProperty("begin_time")
    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public Interval withBeginTime(String beginTime) {
        this.beginTime = beginTime;
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
