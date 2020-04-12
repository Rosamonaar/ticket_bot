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
    "code",
    "contacts",
    "url",
    "logo_svg",
    "title",
    "phone",
    "codes",
    "address",
    "logo",
    "email"
})
public class Carrier {

    @JsonProperty("code")
    private Integer code;
    @JsonProperty("contacts")
    private String contacts;
    @JsonProperty("url")
    private String url;
    @JsonProperty("logo_svg")
    private Object logoSvg;
    @JsonProperty("title")
    private String title;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("codes")
    private Codes codes;
    @JsonProperty("address")
    private String address;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("email")
    private String email;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    public Carrier withCode(Integer code) {
        this.code = code;
        return this;
    }

    @JsonProperty("contacts")
    public String getContacts() {
        return contacts;
    }

    @JsonProperty("contacts")
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public Carrier withContacts(String contacts) {
        this.contacts = contacts;
        return this;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    public Carrier withUrl(String url) {
        this.url = url;
        return this;
    }

    @JsonProperty("logo_svg")
    public Object getLogoSvg() {
        return logoSvg;
    }

    @JsonProperty("logo_svg")
    public void setLogoSvg(Object logoSvg) {
        this.logoSvg = logoSvg;
    }

    public Carrier withLogoSvg(Object logoSvg) {
        this.logoSvg = logoSvg;
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

    public Carrier withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Carrier withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("codes")
    public Codes getCodes() {
        return codes;
    }

    @JsonProperty("codes")
    public void setCodes(Codes codes) {
        this.codes = codes;
    }

    public Carrier withCodes(Codes codes) {
        this.codes = codes;
        return this;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    public Carrier withAddress(String address) {
        this.address = address;
        return this;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Carrier withLogo(String logo) {
        this.logo = logo;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Carrier withEmail(String email) {
        this.email = email;
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
