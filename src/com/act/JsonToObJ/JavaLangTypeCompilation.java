
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
    "CompilationTimeMonitoringSupported",
    "TotalCompilationTime",
    "Name",
    "ObjectName"
})
public class JavaLangTypeCompilation {

    @JsonProperty("CompilationTimeMonitoringSupported")
    private Boolean compilationTimeMonitoringSupported;
    @JsonProperty("TotalCompilationTime")
    private Long totalCompilationTime;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("ObjectName")
    private ObjectName_____ objectName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("CompilationTimeMonitoringSupported")
    public Boolean getCompilationTimeMonitoringSupported() {
        return compilationTimeMonitoringSupported;
    }

    @JsonProperty("CompilationTimeMonitoringSupported")
    public void setCompilationTimeMonitoringSupported(Boolean compilationTimeMonitoringSupported) {
        this.compilationTimeMonitoringSupported = compilationTimeMonitoringSupported;
    }

    @JsonProperty("TotalCompilationTime")
    public Long getTotalCompilationTime() {
        return totalCompilationTime;
    }

    @JsonProperty("TotalCompilationTime")
    public void setTotalCompilationTime(Long totalCompilationTime) {
        this.totalCompilationTime = totalCompilationTime;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("ObjectName")
    public ObjectName_____ getObjectName() {
        return objectName;
    }

    @JsonProperty("ObjectName")
    public void setObjectName(ObjectName_____ objectName) {
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
