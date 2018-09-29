
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
    "init",
    "committed",
    "max",
    "used"
})
public class NonHeapMemoryUsage {

    @JsonProperty("init")
    private Long init;
    @JsonProperty("committed")
    private Long committed;
    @JsonProperty("max")
    private Long max;
    @JsonProperty("used")
    private Long used;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("init")
    public Long getInit() {
        return init;
    }

    @JsonProperty("init")
    public void setInit(Long init) {
        this.init = init;
    }

    @JsonProperty("committed")
    public Long getCommitted() {
        return committed;
    }

    @JsonProperty("committed")
    public void setCommitted(Long committed) {
        this.committed = committed;
    }

    @JsonProperty("max")
    public Long getMax() {
        return max;
    }

    @JsonProperty("max")
    public void setMax(Long max) {
        this.max = max;
    }

    @JsonProperty("used")
    public Long getUsed() {
        return used;
    }

    @JsonProperty("used")
    public void setUsed(Long used) {
        this.used = used;
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
