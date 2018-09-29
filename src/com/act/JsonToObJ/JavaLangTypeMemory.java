
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
    "ObjectPendingFinalizationCount",
    "Verbose",
    "HeapMemoryUsage",
    "NonHeapMemoryUsage",
    "ObjectName"
})
public class JavaLangTypeMemory {

    @JsonProperty("ObjectPendingFinalizationCount")
    private Long objectPendingFinalizationCount;
    @JsonProperty("Verbose")
    private Boolean verbose;
    @JsonProperty("HeapMemoryUsage")
    private HeapMemoryUsage heapMemoryUsage;
    @JsonProperty("NonHeapMemoryUsage")
    private NonHeapMemoryUsage nonHeapMemoryUsage;
    @JsonProperty("ObjectName")
    private ObjectName objectName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ObjectPendingFinalizationCount")
    public Long getObjectPendingFinalizationCount() {
        return objectPendingFinalizationCount;
    }

    @JsonProperty("ObjectPendingFinalizationCount")
    public void setObjectPendingFinalizationCount(Long objectPendingFinalizationCount) {
        this.objectPendingFinalizationCount = objectPendingFinalizationCount;
    }

    @JsonProperty("Verbose")
    public Boolean getVerbose() {
        return verbose;
    }

    @JsonProperty("Verbose")
    public void setVerbose(Boolean verbose) {
        this.verbose = verbose;
    }

    @JsonProperty("HeapMemoryUsage")
    public HeapMemoryUsage getHeapMemoryUsage() {
        return heapMemoryUsage;
    }

    @JsonProperty("HeapMemoryUsage")
    public void setHeapMemoryUsage(HeapMemoryUsage heapMemoryUsage) {
        this.heapMemoryUsage = heapMemoryUsage;
    }

    @JsonProperty("NonHeapMemoryUsage")
    public NonHeapMemoryUsage getNonHeapMemoryUsage() {
        return nonHeapMemoryUsage;
    }

    @JsonProperty("NonHeapMemoryUsage")
    public void setNonHeapMemoryUsage(NonHeapMemoryUsage nonHeapMemoryUsage) {
        this.nonHeapMemoryUsage = nonHeapMemoryUsage;
    }

    @JsonProperty("ObjectName")
    public ObjectName getObjectName() {
        return objectName;
    }

    @JsonProperty("ObjectName")
    public void setObjectName(ObjectName objectName) {
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
