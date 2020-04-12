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
    "pagination",
    "interval_segments",
    "segments",
    "search"
})
public class AvailableTransport {

    @JsonProperty("pagination")
    private Pagination pagination;
    @JsonProperty("interval_segments")
    private List<IntervalSegment> intervalSegments = new ArrayList<IntervalSegment>();
    @JsonProperty("segments")
    private List<Segment> segments = new ArrayList<Segment>();
    @JsonProperty("search")
    private Search search;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pagination")
    public Pagination getPagination() {
        return pagination;
    }

    @JsonProperty("pagination")
    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public AvailableTransport withPagination(Pagination pagination) {
        this.pagination = pagination;
        return this;
    }

    @JsonProperty("interval_segments")
    public List<IntervalSegment> getIntervalSegments() {
        return intervalSegments;
    }

    @JsonProperty("interval_segments")
    public void setIntervalSegments(List<IntervalSegment> intervalSegments) {
        this.intervalSegments = intervalSegments;
    }

    public AvailableTransport withIntervalSegments(List<IntervalSegment> intervalSegments) {
        this.intervalSegments = intervalSegments;
        return this;
    }

    @JsonProperty("segments")
    public List<Segment> getSegments() {
        return segments;
    }

    @JsonProperty("segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public AvailableTransport withSegments(List<Segment> segments) {
        this.segments = segments;
        return this;
    }

    @JsonProperty("search")
    public Search getSearch() {
        return search;
    }

    @JsonProperty("search")
    public void setSearch(Search search) {
        this.search = search;
    }

    public AvailableTransport withSearch(Search search) {
        this.search = search;
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
