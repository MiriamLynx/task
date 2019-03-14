
package com.ivanbalseirogarcia.task;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "numFound",
    "start",
    "maxScore",
    "docs"
})
public class Response {

    @JsonProperty("numFound")
    private Integer numFound;
    @JsonProperty("start")
    private Integer start;
    @JsonProperty("maxScore")
    private Double maxScore;
    @JsonProperty("docs")
    private List<Doc> docs = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("numFound")
    public Integer getNumFound() {
        return numFound;
    }

    @JsonProperty("numFound")
    public void setNumFound(Integer numFound) {
        this.numFound = numFound;
    }

    public Response withNumFound(Integer numFound) {
        this.numFound = numFound;
        return this;
    }

    @JsonProperty("start")
    public Integer getStart() {
        return start;
    }

    @JsonProperty("start")
    public void setStart(Integer start) {
        this.start = start;
    }

    public Response withStart(Integer start) {
        this.start = start;
        return this;
    }

    @JsonProperty("maxScore")
    public Double getMaxScore() {
        return maxScore;
    }

    @JsonProperty("maxScore")
    public void setMaxScore(Double maxScore) {
        this.maxScore = maxScore;
    }

    public Response withMaxScore(Double maxScore) {
        this.maxScore = maxScore;
        return this;
    }

    @JsonProperty("docs")
    public List<Doc> getDocs() {
        return docs;
    }

    @JsonProperty("docs")
    public void setDocs(List<Doc> docs) {
        this.docs = docs;
    }

    public Response withDocs(List<Doc> docs) {
        this.docs = docs;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Response withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("numFound", numFound).append("start", start).append("maxScore", maxScore).append("docs", docs).append("additionalProperties", additionalProperties).toString();
    }

}
