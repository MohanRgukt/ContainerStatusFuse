
package com.act.JsonToObJ;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "propertyPattern",
    "domainPattern",
    "keyPropertyList",
    "domain",
    "pattern",
    "propertyValuePattern",
    "canonicalKeyPropertyListString",
    "propertyListPattern",
    "keyPropertyListString",
    "canonicalName"
})
public class ObjectName____ {

    @JsonProperty("propertyPattern")
    private Boolean propertyPattern;
    @JsonProperty("domainPattern")
    private Boolean domainPattern;
    @JsonProperty("keyPropertyList")
    private KeyPropertyList____ keyPropertyList;
    @JsonProperty("domain")
    private String domain;
    @JsonProperty("pattern")
    private Boolean pattern;
    @JsonProperty("propertyValuePattern")
    private Boolean propertyValuePattern;
    @JsonProperty("canonicalKeyPropertyListString")
    private String canonicalKeyPropertyListString;
    @JsonProperty("propertyListPattern")
    private Boolean propertyListPattern;
    @JsonProperty("keyPropertyListString")
    private String keyPropertyListString;
    @JsonProperty("canonicalName")
    private String canonicalName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("propertyPattern")
    public Boolean getPropertyPattern() {
        return propertyPattern;
    }

    @JsonProperty("propertyPattern")
    public void setPropertyPattern(Boolean propertyPattern) {
        this.propertyPattern = propertyPattern;
    }

    @JsonProperty("domainPattern")
    public Boolean getDomainPattern() {
        return domainPattern;
    }

    @JsonProperty("domainPattern")
    public void setDomainPattern(Boolean domainPattern) {
        this.domainPattern = domainPattern;
    }

    @JsonProperty("keyPropertyList")
    public KeyPropertyList____ getKeyPropertyList() {
        return keyPropertyList;
    }

    @JsonProperty("keyPropertyList")
    public void setKeyPropertyList(KeyPropertyList____ keyPropertyList) {
        this.keyPropertyList = keyPropertyList;
    }

    @JsonProperty("domain")
    public String getDomain() {
        return domain;
    }

    @JsonProperty("domain")
    public void setDomain(String domain) {
        this.domain = domain;
    }

    @JsonProperty("pattern")
    public Boolean getPattern() {
        return pattern;
    }

    @JsonProperty("pattern")
    public void setPattern(Boolean pattern) {
        this.pattern = pattern;
    }

    @JsonProperty("propertyValuePattern")
    public Boolean getPropertyValuePattern() {
        return propertyValuePattern;
    }

    @JsonProperty("propertyValuePattern")
    public void setPropertyValuePattern(Boolean propertyValuePattern) {
        this.propertyValuePattern = propertyValuePattern;
    }

    @JsonProperty("canonicalKeyPropertyListString")
    public String getCanonicalKeyPropertyListString() {
        return canonicalKeyPropertyListString;
    }

    @JsonProperty("canonicalKeyPropertyListString")
    public void setCanonicalKeyPropertyListString(String canonicalKeyPropertyListString) {
        this.canonicalKeyPropertyListString = canonicalKeyPropertyListString;
    }

    @JsonProperty("propertyListPattern")
    public Boolean getPropertyListPattern() {
        return propertyListPattern;
    }

    @JsonProperty("propertyListPattern")
    public void setPropertyListPattern(Boolean propertyListPattern) {
        this.propertyListPattern = propertyListPattern;
    }

    @JsonProperty("keyPropertyListString")
    public String getKeyPropertyListString() {
        return keyPropertyListString;
    }

    @JsonProperty("keyPropertyListString")
    public void setKeyPropertyListString(String keyPropertyListString) {
        this.keyPropertyListString = keyPropertyListString;
    }

    @JsonProperty("canonicalName")
    public String getCanonicalName() {
        return canonicalName;
    }

    @JsonProperty("canonicalName")
    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
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
