
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
    "LoadedClassCount",
    "UnloadedClassCount",
    "Verbose",
    "TotalLoadedClassCount",
    "ObjectName"
})
public class JavaLangTypeClassLoading {

    @JsonProperty("LoadedClassCount")
    private Long loadedClassCount;
    @JsonProperty("UnloadedClassCount")
    private Long unloadedClassCount;
    @JsonProperty("Verbose")
    private Boolean verbose;
    @JsonProperty("TotalLoadedClassCount")
    private Long totalLoadedClassCount;
    @JsonProperty("ObjectName")
    private ObjectName_ objectName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("LoadedClassCount")
    public Long getLoadedClassCount() {
        return loadedClassCount;
    }

    @JsonProperty("LoadedClassCount")
    public void setLoadedClassCount(Long loadedClassCount) {
        this.loadedClassCount = loadedClassCount;
    }

    @JsonProperty("UnloadedClassCount")
    public Long getUnloadedClassCount() {
        return unloadedClassCount;
    }

    @JsonProperty("UnloadedClassCount")
    public void setUnloadedClassCount(Long unloadedClassCount) {
        this.unloadedClassCount = unloadedClassCount;
    }

    @JsonProperty("Verbose")
    public Boolean getVerbose() {
        return verbose;
    }

    @JsonProperty("Verbose")
    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }

    @JsonProperty("TotalLoadedClassCount")
    public Long getTotalLoadedClassCount() {
        return totalLoadedClassCount;
    }

    @JsonProperty("TotalLoadedClassCount")
    public void setTotalLoadedClassCount(Long totalLoadedClassCount) {
        this.totalLoadedClassCount = totalLoadedClassCount;
    }

    @JsonProperty("ObjectName")
    public ObjectName_ getObjectName() {
        return objectName;
    }

    @JsonProperty("ObjectName")
    public void setObjectName(ObjectName_ objectName) {
        this.objectName = objectName;
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
