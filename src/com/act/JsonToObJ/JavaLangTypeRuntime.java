
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
    "SpecVendor",
    "ClassPath",
    "InputArguments",
    "Uptime",
    "VmName",
    "StartTime",
    "SpecName",
    "VmVersion",
    "ManagementSpecVersion",
    "Name",
    "ObjectName",
    "VmVendor",
    "LibraryPath",
    "BootClassPath",
    "SpecVersion",
    "SystemProperties",
    "BootClassPathSupported"
})
public class JavaLangTypeRuntime {

    @JsonProperty("SpecVendor")
    private String specVendor;
    @JsonProperty("ClassPath")
    private String classPath;
    @JsonProperty("InputArguments")
    private List<String> inputArguments = null;
    @JsonProperty("Uptime")
    private Long uptime;
    @JsonProperty("VmName")
    private String vmName;
    @JsonProperty("StartTime")
    private Long startTime;
    @JsonProperty("SpecName")
    private String specName;
    @JsonProperty("VmVersion")
    private String vmVersion;
    @JsonProperty("ManagementSpecVersion")
    private String managementSpecVersion;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("ObjectName")
    private ObjectName__ objectName;
    @JsonProperty("VmVendor")
    private String vmVendor;
    @JsonProperty("LibraryPath")
    private String libraryPath;
    @JsonProperty("BootClassPath")
    private String bootClassPath;
    @JsonProperty("SpecVersion")
    private String specVersion;
    @JsonProperty("SystemProperties")
    private SystemProperties systemProperties;
    @JsonProperty("BootClassPathSupported")
    private Boolean bootClassPathSupported;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("SpecVendor")
    public String getSpecVendor() {
        return specVendor;
    }

    @JsonProperty("SpecVendor")
    public void setSpecVendor(String specVendor) {
        this.specVendor = specVendor;
    }

    @JsonProperty("ClassPath")
    public String getClassPath() {
        return classPath;
    }

    @JsonProperty("ClassPath")
    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    @JsonProperty("InputArguments")
    public List<String> getInputArguments() {
        return inputArguments;
    }

    @JsonProperty("InputArguments")
    public void setInputArguments(List<String> inputArguments) {
        this.inputArguments = inputArguments;
    }

    @JsonProperty("Uptime")
    public Long getUptime() {
        return uptime;
    }

    @JsonProperty("Uptime")
    public void setUptime(Long uptime) {
        this.uptime = uptime;
    }

    @JsonProperty("VmName")
    public String getVmName() {
        return vmName;
    }

    @JsonProperty("VmName")
    public void setVmName(String vmName) {
        this.vmName = vmName;
    }

    @JsonProperty("StartTime")
    public Long getStartTime() {
        return startTime;
    }

    @JsonProperty("StartTime")
    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    @JsonProperty("SpecName")
    public String getSpecName() {
        return specName;
    }

    @JsonProperty("SpecName")
    public void setSpecName(String specName) {
        this.specName = specName;
    }

    @JsonProperty("VmVersion")
    public String getVmVersion() {
        return vmVersion;
    }

    @JsonProperty("VmVersion")
    public void setVmVersion(String vmVersion) {
        this.vmVersion = vmVersion;
    }

    @JsonProperty("ManagementSpecVersion")
    public String getManagementSpecVersion() {
        return managementSpecVersion;
    }

    @JsonProperty("ManagementSpecVersion")
    public void setManagementSpecVersion(String managementSpecVersion) {
        this.managementSpecVersion = managementSpecVersion;
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
    public ObjectName__ getObjectName() {
        return objectName;
    }

    @JsonProperty("ObjectName")
    public void setObjectName(ObjectName__ objectName) {
        this.objectName = objectName;
    }

    @JsonProperty("VmVendor")
    public String getVmVendor() {
        return vmVendor;
    }

    @JsonProperty("VmVendor")
    public void setVmVendor(String vmVendor) {
        this.vmVendor = vmVendor;
    }

    @JsonProperty("LibraryPath")
    public String getLibraryPath() {
        return libraryPath;
    }

    @JsonProperty("LibraryPath")
    public void setLibraryPath(String libraryPath) {
        this.libraryPath = libraryPath;
    }

    @JsonProperty("BootClassPath")
    public String getBootClassPath() {
        return bootClassPath;
    }

    @JsonProperty("BootClassPath")
    public void setBootClassPath(String bootClassPath) {
        this.bootClassPath = bootClassPath;
    }

    @JsonProperty("SpecVersion")
    public String getSpecVersion() {
        return specVersion;
    }

    @JsonProperty("SpecVersion")
    public void setSpecVersion(String specVersion) {
        this.specVersion = specVersion;
    }

    @JsonProperty("SystemProperties")
    public SystemProperties getSystemProperties() {
        return systemProperties;
    }

    @JsonProperty("SystemProperties")
    public void setSystemProperties(SystemProperties systemProperties) {
        this.systemProperties = systemProperties;
    }

    @JsonProperty("BootClassPathSupported")
    public Boolean getBootClassPathSupported() {
        return bootClassPathSupported;
    }

    @JsonProperty("BootClassPathSupported")
    public void setBootClassPathSupported(Boolean bootClassPathSupported) {
        this.bootClassPathSupported = bootClassPathSupported;
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
