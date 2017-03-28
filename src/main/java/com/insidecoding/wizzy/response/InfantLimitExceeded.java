
package com.insidecoding.wizzy.response;

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
    "limitExceeded",
    "isBlocking"
})
public class InfantLimitExceeded {

    @JsonProperty("limitExceeded")
    private Boolean limitExceeded;
    @JsonProperty("isBlocking")
    private Boolean isBlocking;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("limitExceeded")
    public Boolean getLimitExceeded() {
        return limitExceeded;
    }

    @JsonProperty("limitExceeded")
    public void setLimitExceeded(Boolean limitExceeded) {
        this.limitExceeded = limitExceeded;
    }

    @JsonProperty("isBlocking")
    public Boolean getIsBlocking() {
        return isBlocking;
    }

    @JsonProperty("isBlocking")
    public void setIsBlocking(Boolean isBlocking) {
        this.isBlocking = isBlocking;
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
