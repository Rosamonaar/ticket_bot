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
public class Carrier_ {

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
    private Codes_ codes;
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

    public Carrier_ withCode(Integer code) {
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

    public Carrier_ withContacts(String contacts) {
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

    public Carrier_ withUrl(String url) {
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

    public Carrier_ withLogoSvg(Object logoSvg) {
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

    public Carrier_ withTitle(String title) {
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

    public Carrier_ withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @JsonProperty("codes")
    public Codes_ getCodes() {
        return codes;
    }

    @JsonProperty("codes")
    public void setCodes(Codes_ codes) {
        this.codes = codes;
    }

    public Carrier_ withCodes(Codes_ codes) {
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

    public Carrier_ withAddress(String address) {
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

    public Carrier_ withLogo(String logo) {
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

    public Carrier_ withEmail(String email) {
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
