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
    "icao",
    "sirena",
    "iata"
})
public class Codes {

    @JsonProperty("icao")
    private Object icao;
    @JsonProperty("sirena")
    private String sirena;
    @JsonProperty("iata")
    private String iata;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("icao")
    public Object getIcao() {
        return icao;
    }

    @JsonProperty("icao")
    public void setIcao(Object icao) {
        this.icao = icao;
    }

    public Codes withIcao(Object icao) {
        this.icao = icao;
        return this;
    }

    @JsonProperty("sirena")
    public String getSirena() {
        return sirena;
    }

    @JsonProperty("sirena")
    public void setSirena(String sirena) {
        this.sirena = sirena;
    }

    public Codes withSirena(String sirena) {
        this.sirena = sirena;
        return this;
    }

    @JsonProperty("iata")
    public String getIata() {
        return iata;
    }

    @JsonProperty("iata")
    public void setIata(String iata) {
        this.iata = iata;
    }

    public Codes withIata(String iata) {
        this.iata = iata;
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
