
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
    "request",
    "value",
    "timestamp",
    "status"
})
public class ObjConverter {

    @JsonProperty("request")
    private Request request;
    @JsonProperty("value")
    private Value value;
    @JsonProperty("timestamp")
    private Integer timestamp;
    @JsonProperty("status")
    private Integer status;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("request")
    public Request getRequest() {
        return request;
    }

    @JsonProperty("request")
    public void setRequest(Request request) {
        this.request = request;
    }

    @JsonProperty("value")
    public Value getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Value value) {
        this.value = value;
    }

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer status) {
        this.status = status;
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
