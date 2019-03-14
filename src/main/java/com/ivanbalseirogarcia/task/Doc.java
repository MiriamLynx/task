
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
    "id",
    "journal",
    "eissn",
    "publication_date",
    "article_type",
    "author_display",
    "abstract",
    "title_display",
    "score"
})
public class Doc {

    @JsonProperty("id")
    private String id;
    @JsonProperty("journal")
    private String journal;
    @JsonProperty("eissn")
    private String eissn;
    @JsonProperty("publication_date")
    private String publicationDate;
    @JsonProperty("article_type")
    private String articleType;
    @JsonProperty("author_display")
    private List<String> authorDisplay = null;
    @JsonProperty("abstract")
    private List<String> _abstract = null;
    @JsonProperty("title_display")
    private String titleDisplay;
    @JsonProperty("score")
    private Double score;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    public Doc withId(String id) {
        this.id = id;
        return this;
    }

    @JsonProperty("journal")
    public String getJournal() {
        return journal;
    }

    @JsonProperty("journal")
    public void setJournal(String journal) {
        this.journal = journal;
    }

    public Doc withJournal(String journal) {
        this.journal = journal;
        return this;
    }

    @JsonProperty("eissn")
    public String getEissn() {
        return eissn;
    }

    @JsonProperty("eissn")
    public void setEissn(String eissn) {
        this.eissn = eissn;
    }

    public Doc withEissn(String eissn) {
        this.eissn = eissn;
        return this;
    }

    @JsonProperty("publication_date")
    public String getPublicationDate() {
        return publicationDate;
    }

    @JsonProperty("publication_date")
    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Doc withPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
        return this;
    }

    @JsonProperty("article_type")
    public String getArticleType() {
        return articleType;
    }

    @JsonProperty("article_type")
    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public Doc withArticleType(String articleType) {
        this.articleType = articleType;
        return this;
    }

    @JsonProperty("author_display")
    public List<String> getAuthorDisplay() {
        return authorDisplay;
    }

    @JsonProperty("author_display")
    public void setAuthorDisplay(List<String> authorDisplay) {
        this.authorDisplay = authorDisplay;
    }

    public Doc withAuthorDisplay(List<String> authorDisplay) {
        this.authorDisplay = authorDisplay;
        return this;
    }

    @JsonProperty("abstract")
    public List<String> getAbstract() {
        return _abstract;
    }

    @JsonProperty("abstract")
    public void setAbstract(List<String> _abstract) {
        this._abstract = _abstract;
    }

    public Doc withAbstract(List<String> _abstract) {
        this._abstract = _abstract;
        return this;
    }

    @JsonProperty("title_display")
    public String getTitleDisplay() {
        return titleDisplay;
    }

    @JsonProperty("title_display")
    public void setTitleDisplay(String titleDisplay) {
        this.titleDisplay = titleDisplay;
    }

    public Doc withTitleDisplay(String titleDisplay) {
        this.titleDisplay = titleDisplay;
        return this;
    }

    @JsonProperty("score")
    public Double getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Double score) {
        this.score = score;
    }

    public Doc withScore(Double score) {
        this.score = score;
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

    public Doc withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("journal", journal).append("eissn", eissn).append("publicationDate", publicationDate).append("articleType", articleType).append("authorDisplay", authorDisplay).append("_abstract", _abstract).append("titleDisplay", titleDisplay).append("score", score).append("additionalProperties", additionalProperties).toString();
    }

}
