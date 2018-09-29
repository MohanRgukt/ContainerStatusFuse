
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
    "OpenFileDescriptorCount",
    "CommittedVirtualMemorySize",
    "FreePhysicalMemorySize",
    "SystemLoadAverage",
    "Arch",
    "ProcessCpuLoad",
    "FreeSwapSpaceSize",
    "TotalPhysicalMemorySize",
    "Name",
    "ObjectName",
    "TotalSwapSpaceSize",
    "ProcessCpuTime",
    "MaxFileDescriptorCount",
    "SystemCpuLoad",
    "Version",
    "AvailableProcessors"
})
public class JavaLangTypeOperatingSystem {

    @JsonProperty("OpenFileDescriptorCount")
    private Long openFileDescriptorCount;
    @JsonProperty("CommittedVirtualMemorySize")
    private Long committedVirtualMemorySize;
    @JsonProperty("FreePhysicalMemorySize")
    private Long freePhysicalMemorySize;
    @JsonProperty("SystemLoadAverage")
    private Double systemLoadAverage;
    @JsonProperty("Arch")
    private String arch;
    @JsonProperty("ProcessCpuLoad")
    private Double processCpuLoad;
    @JsonProperty("FreeSwapSpaceSize")
    private Long freeSwapSpaceSize;
    @JsonProperty("TotalPhysicalMemorySize")
    private Long totalPhysicalMemorySize;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("ObjectName")
    private ObjectName____ objectName;
    @JsonProperty("TotalSwapSpaceSize")
    private Long totalSwapSpaceSize;
    @JsonProperty("ProcessCpuTime")
    private Long processCpuTime;
    @JsonProperty("MaxFileDescriptorCount")
    private Long maxFileDescriptorCount;
    @JsonProperty("SystemCpuLoad")
    private Double systemCpuLoad;
    @JsonProperty("Version")
    private String version;
    @JsonProperty("AvailableProcessors")
    private Long availableProcessors;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("OpenFileDescriptorCount")
    public Long getOpenFileDescriptorCount() {
        return openFileDescriptorCount;
    }

    @JsonProperty("OpenFileDescriptorCount")
    public void setOpenFileDescriptorCount(Long openFileDescriptorCount) {
        this.openFileDescriptorCount = openFileDescriptorCount;
    }

    @JsonProperty("CommittedVirtualMemorySize")
    public Long getCommittedVirtualMemorySize() {
        return committedVirtualMemorySize;
    }

    @JsonProperty("CommittedVirtualMemorySize")
    public void setCommittedVirtualMemorySize(Long committedVirtualMemorySize) {
        this.committedVirtualMemorySize = committedVirtualMemorySize;
    }

    @JsonProperty("FreePhysicalMemorySize")
    public Long getFreePhysicalMemorySize() {
        return freePhysicalMemorySize;
    }

    @JsonProperty("FreePhysicalMemorySize")
    public void setFreePhysicalMemorySize(Long freePhysicalMemorySize) {
        this.freePhysicalMemorySize = freePhysicalMemorySize;
    }

    @JsonProperty("SystemLoadAverage")
    public Double getSystemLoadAverage() {
        return systemLoadAverage;
    }

    @JsonProperty("SystemLoadAverage")
    public void setSystemLoadAverage(Double systemLoadAverage) {
        this.systemLoadAverage = systemLoadAverage;
    }

    @JsonProperty("Arch")
    public String getArch() {
        return arch;
    }

    @JsonProperty("Arch")
    public void setArch(String arch) {
        this.arch = arch;
    }

    @JsonProperty("ProcessCpuLoad")
    public Double getProcessCpuLoad() {
        return processCpuLoad;
    }

    @JsonProperty("ProcessCpuLoad")
    public void setProcessCpuLoad(Double processCpuLoad) {
        this.processCpuLoad = processCpuLoad;
    }

    @JsonProperty("FreeSwapSpaceSize")
    public Long getFreeSwapSpaceSize() {
        return freeSwapSpaceSize;
    }

    @JsonProperty("FreeSwapSpaceSize")
    public void setFreeSwapSpaceSize(Long freeSwapSpaceSize) {
        this.freeSwapSpaceSize = freeSwapSpaceSize;
    }

    @JsonProperty("TotalPhysicalMemorySize")
    public Long getTotalPhysicalMemorySize() {
        return totalPhysicalMemorySize;
    }

    @JsonProperty("TotalPhysicalMemorySize")
    public void setTotalPhysicalMemorySize(Long totalPhysicalMemorySize) {
        this.totalPhysicalMemorySize = totalPhysicalMemorySize;
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
    public ObjectName____ getObjectName() {
        return objectName;
    }

    @JsonProperty("ObjectName")
    public void setObjectName(ObjectName____ objectName) {
        this.objectName = objectName;
    }

    @JsonProperty("TotalSwapSpaceSize")
    public Long getTotalSwapSpaceSize() {
        return totalSwapSpaceSize;
    }

    @JsonProperty("TotalSwapSpaceSize")
    public void setTotalSwapSpaceSize(Long totalSwapSpaceSize) {
        this.totalSwapSpaceSize = totalSwapSpaceSize;
    }

    @JsonProperty("ProcessCpuTime")
    public Long getProcessCpuTime() {
        return processCpuTime;
    }

    @JsonProperty("ProcessCpuTime")
    public void setProcessCpuTime(Long processCpuTime) {
        this.processCpuTime = processCpuTime;
    }

    @JsonProperty("MaxFileDescriptorCount")
    public Long getMaxFileDescriptorCount() {
        return maxFileDescriptorCount;
    }

    @JsonProperty("MaxFileDescriptorCount")
    public void setMaxFileDescriptorCount(Long maxFileDescriptorCount) {
        this.maxFileDescriptorCount = maxFileDescriptorCount;
    }

    @JsonProperty("SystemCpuLoad")
    public Double getSystemCpuLoad() {
        return systemCpuLoad;
    }

    @JsonProperty("SystemCpuLoad")
    public void setSystemCpuLoad(Double systemCpuLoad) {
        this.systemCpuLoad = systemCpuLoad;
    }

    @JsonProperty("Version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("AvailableProcessors")
    public Long getAvailableProcessors() {
        return availableProcessors;
    }

    @JsonProperty("AvailableProcessors")
    public void setAvailableProcessors(Long availableProcessors) {
        this.availableProcessors = availableProcessors;
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
