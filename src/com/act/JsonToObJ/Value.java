
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
    "java.lang:type=Memory",
    "java.lang:type=ClassLoading",
    "java.lang:type=Runtime",
    "java.lang:type=Threading",
    "java.lang:type=OperatingSystem",
    "java.lang:type=Compilation"
})
public class Value {

    @JsonProperty("java.lang:type=Memory")
    private JavaLangTypeMemory javaLangTypeMemory;
    @JsonProperty("java.lang:type=ClassLoading")
    private JavaLangTypeClassLoading javaLangTypeClassLoading;
    @JsonProperty("java.lang:type=Runtime")
    private JavaLangTypeRuntime javaLangTypeRuntime;
    @JsonProperty("java.lang:type=Threading")
    private JavaLangTypeThreading javaLangTypeThreading;
    @JsonProperty("java.lang:type=OperatingSystem")
    private JavaLangTypeOperatingSystem javaLangTypeOperatingSystem;
    @JsonProperty("java.lang:type=Compilation")
    private JavaLangTypeCompilation javaLangTypeCompilation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("java.lang:type=Memory")
    public JavaLangTypeMemory getJavaLangTypeMemory() {
        return javaLangTypeMemory;
    }

    @JsonProperty("java.lang:type=Memory")
    public void setJavaLangTypeMemory(JavaLangTypeMemory javaLangTypeMemory) {
        this.javaLangTypeMemory = javaLangTypeMemory;
    }

    @JsonProperty("java.lang:type=ClassLoading")
    public JavaLangTypeClassLoading getJavaLangTypeClassLoading() {
        return javaLangTypeClassLoading;
    }

    @JsonProperty("java.lang:type=ClassLoading")
    public void setJavaLangTypeClassLoading(JavaLangTypeClassLoading javaLangTypeClassLoading) {
        this.javaLangTypeClassLoading = javaLangTypeClassLoading;
    }

    @JsonProperty("java.lang:type=Runtime")
    public JavaLangTypeRuntime getJavaLangTypeRuntime() {
        return javaLangTypeRuntime;
    }

    @JsonProperty("java.lang:type=Runtime")
    public void setJavaLangTypeRuntime(JavaLangTypeRuntime javaLangTypeRuntime) {
        this.javaLangTypeRuntime = javaLangTypeRuntime;
    }

    @JsonProperty("java.lang:type=Threading")
    public JavaLangTypeThreading getJavaLangTypeThreading() {
        return javaLangTypeThreading;
    }

    @JsonProperty("java.lang:type=Threading")
    public void setJavaLangTypeThreading(JavaLangTypeThreading javaLangTypeThreading) {
        this.javaLangTypeThreading = javaLangTypeThreading;
    }

    @JsonProperty("java.lang:type=OperatingSystem")
    public JavaLangTypeOperatingSystem getJavaLangTypeOperatingSystem() {
        return javaLangTypeOperatingSystem;
    }

    @JsonProperty("java.lang:type=OperatingSystem")
    public void setJavaLangTypeOperatingSystem(JavaLangTypeOperatingSystem javaLangTypeOperatingSystem) {
        this.javaLangTypeOperatingSystem = javaLangTypeOperatingSystem;
    }

    @JsonProperty("java.lang:type=Compilation")
    public JavaLangTypeCompilation getJavaLangTypeCompilation() {
        return javaLangTypeCompilation;
    }

    @JsonProperty("java.lang:type=Compilation")
    public void setJavaLangTypeCompilation(JavaLangTypeCompilation javaLangTypeCompilation) {
        this.javaLangTypeCompilation = javaLangTypeCompilation;
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
