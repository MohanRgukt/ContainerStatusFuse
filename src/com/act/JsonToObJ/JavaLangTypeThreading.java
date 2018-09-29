
package com.act.JsonToObJ;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ThreadAllocatedMemorySupported",
    "ThreadContentionMonitoringEnabled",
    "TotalStartedThreadCount",
    "CurrentThreadUserTime",
    "CurrentThreadCpuTimeSupported",
    "AllThreadIds",
    "PeakThreadCount",
    "ThreadAllocatedMemoryEnabled",
    "CurrentThreadCpuTime",
    "ObjectName",
    "ThreadCpuTimeSupported",
    "ThreadContentionMonitoringSupported",
    "ThreadCount",
    "ThreadCpuTimeEnabled",
    "ObjectMonitorUsageSupported",
    "SynchronizerUsageSupported",
    "DaemonThreadCount"
})
public class JavaLangTypeThreading {

    @JsonProperty("ThreadAllocatedMemorySupported")
    private Boolean threadAllocatedMemorySupported;
    @JsonProperty("ThreadContentionMonitoringEnabled")
    private Boolean threadContentionMonitoringEnabled;
    @JsonProperty("TotalStartedThreadCount")
    private Long totalStartedThreadCount;
    @JsonProperty("CurrentThreadUserTime")
    private Long currentThreadUserTime;
    @JsonProperty("CurrentThreadCpuTimeSupported")
    private Boolean currentThreadCpuTimeSupported;
    @JsonProperty("AllThreadIds")
    private List<Long> allThreadIds = null;
    @JsonProperty("PeakThreadCount")
    private Long peakThreadCount;
    @JsonProperty("ThreadAllocatedMemoryEnabled")
    private Boolean threadAllocatedMemoryEnabled;
    @JsonProperty("CurrentThreadCpuTime")
    private Long currentThreadCpuTime;
    @JsonProperty("ObjectName")
    private ObjectName___ objectName;
    @JsonProperty("ThreadCpuTimeSupported")
    private Boolean threadCpuTimeSupported;
    @JsonProperty("ThreadContentionMonitoringSupported")
    private Boolean threadContentionMonitoringSupported;
    @JsonProperty("ThreadCount")
    private Long threadCount;
    @JsonProperty("ThreadCpuTimeEnabled")
    private Boolean threadCpuTimeEnabled;
    @JsonProperty("ObjectMonitorUsageSupported")
    private Boolean objectMonitorUsageSupported;
    @JsonProperty("SynchronizerUsageSupported")
    private Boolean synchronizerUsageSupported;
    @JsonProperty("DaemonThreadCount")
    private Long daemonThreadCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("ThreadAllocatedMemorySupported")
    public Boolean getThreadAllocatedMemorySupported() {
        return threadAllocatedMemorySupported;
    }

    @JsonProperty("ThreadAllocatedMemorySupported")
    public void setThreadAllocatedMemorySupported(Boolean threadAllocatedMemorySupported) {
        this.threadAllocatedMemorySupported = threadAllocatedMemorySupported;
    }

    @JsonProperty("ThreadContentionMonitoringEnabled")
    public Boolean getThreadContentionMonitoringEnabled() {
        return threadContentionMonitoringEnabled;
    }

    @JsonProperty("ThreadContentionMonitoringEnabled")
    public void setThreadContentionMonitoringEnabled(Boolean threadContentionMonitoringEnabled) {
        this.threadContentionMonitoringEnabled = threadContentionMonitoringEnabled;
    }

    @JsonProperty("TotalStartedThreadCount")
    public Long getTotalStartedThreadCount() {
        return totalStartedThreadCount;
    }

    @JsonProperty("TotalStartedThreadCount")
    public void setTotalStartedThreadCount(Long totalStartedThreadCount) {
        this.totalStartedThreadCount = totalStartedThreadCount;
    }

    @JsonProperty("CurrentThreadUserTime")
    public Long getCurrentThreadUserTime() {
        return currentThreadUserTime;
    }

    @JsonProperty("CurrentThreadUserTime")
    public void setCurrentThreadUserTime(Long currentThreadUserTime) {
        this.currentThreadUserTime = currentThreadUserTime;
    }

    @JsonProperty("CurrentThreadCpuTimeSupported")
    public Boolean getCurrentThreadCpuTimeSupported() {
        return currentThreadCpuTimeSupported;
    }

    @JsonProperty("CurrentThreadCpuTimeSupported")
    public void setCurrentThreadCpuTimeSupported(Boolean currentThreadCpuTimeSupported) {
        this.currentThreadCpuTimeSupported = currentThreadCpuTimeSupported;
    }

    @JsonProperty("AllThreadIds")
    public List<Long> getAllThreadIds() {
        return allThreadIds;
    }

    @JsonProperty("AllThreadIds")
    public void setAllThreadIds(List<Long> allThreadIds) {
        this.allThreadIds = allThreadIds;
    }

    @JsonProperty("PeakThreadCount")
    public Long getPeakThreadCount() {
        return peakThreadCount;
    }

    @JsonProperty("PeakThreadCount")
    public void setPeakThreadCount(Long peakThreadCount) {
        this.peakThreadCount = peakThreadCount;
    }

    @JsonProperty("ThreadAllocatedMemoryEnabled")
    public Boolean getThreadAllocatedMemoryEnabled() {
        return threadAllocatedMemoryEnabled;
    }

    @JsonProperty("ThreadAllocatedMemoryEnabled")
    public void setThreadAllocatedMemoryEnabled(Boolean threadAllocatedMemoryEnabled) {
        this.threadAllocatedMemoryEnabled = threadAllocatedMemoryEnabled;
    }

    @JsonProperty("CurrentThreadCpuTime")
    public Long getCurrentThreadCpuTime() {
        return currentThreadCpuTime;
    }

    @JsonProperty("CurrentThreadCpuTime")
    public void setCurrentThreadCpuTime(Long currentThreadCpuTime) {
        this.currentThreadCpuTime = currentThreadCpuTime;
    }

    @JsonProperty("ObjectName")
    public ObjectName___ getObjectName() {
        return objectName;
    }

    @JsonProperty("ObjectName")
    public void setObjectName(ObjectName___ objectName) {
        this.objectName = objectName;
    }

    @JsonProperty("ThreadCpuTimeSupported")
    public Boolean getThreadCpuTimeSupported() {
        return threadCpuTimeSupported;
    }

    @JsonProperty("ThreadCpuTimeSupported")
    public void setThreadCpuTimeSupported(Boolean threadCpuTimeSupported) {
        this.threadCpuTimeSupported = threadCpuTimeSupported;
    }

    @JsonProperty("ThreadContentionMonitoringSupported")
    public Boolean getThreadContentionMonitoringSupported() {
        return threadContentionMonitoringSupported;
    }

    @JsonProperty("ThreadContentionMonitoringSupported")
    public void setThreadContentionMonitoringSupported(Boolean threadContentionMonitoringSupported) {
        this.threadContentionMonitoringSupported = threadContentionMonitoringSupported;
    }

    @JsonProperty("ThreadCount")
    public Long getThreadCount() {
        return threadCount;
    }

    @JsonProperty("ThreadCount")
    public void setThreadCount(Long threadCount) {
        this.threadCount = threadCount;
    }

    @JsonProperty("ThreadCpuTimeEnabled")
    public Boolean getThreadCpuTimeEnabled() {
        return threadCpuTimeEnabled;
    }

    @JsonProperty("ThreadCpuTimeEnabled")
    public void setThreadCpuTimeEnabled(Boolean threadCpuTimeEnabled) {
        this.threadCpuTimeEnabled = threadCpuTimeEnabled;
    }

    @JsonProperty("ObjectMonitorUsageSupported")
    public Boolean getObjectMonitorUsageSupported() {
        return objectMonitorUsageSupported;
    }

    @JsonProperty("ObjectMonitorUsageSupported")
    public void setObjectMonitorUsageSupported(Boolean objectMonitorUsageSupported) {
        this.objectMonitorUsageSupported = objectMonitorUsageSupported;
    }

    @JsonProperty("SynchronizerUsageSupported")
    public Boolean getSynchronizerUsageSupported() {
        return synchronizerUsageSupported;
    }

    @JsonProperty("SynchronizerUsageSupported")
    public void setSynchronizerUsageSupported(Boolean synchronizerUsageSupported) {
        this.synchronizerUsageSupported = synchronizerUsageSupported;
    }

    @JsonProperty("DaemonThreadCount")
    public Long getDaemonThreadCount() {
        return daemonThreadCount;
    }

    @JsonProperty("DaemonThreadCount")
    public void setDaemonThreadCount(Long daemonThreadCount) {
        this.daemonThreadCount = daemonThreadCount;
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
