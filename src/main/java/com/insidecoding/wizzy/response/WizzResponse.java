
package com.insidecoding.wizzy.response;

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
    "outboundFlights",
    "returnFlights",
    "outboundBundles",
    "returnBundles",
    "currencyCode",
    "arrivalStationCurrencyCode",
    "isDomestic"
})
public class WizzResponse {

    @JsonProperty("outboundFlights")
    private List<OutboundFlight> outboundFlights = null;
    @JsonProperty("returnFlights")
    private List<ReturnFlight> returnFlights = null;
    @JsonProperty("outboundBundles")
    private List<OutboundBundle> outboundBundles = null;
    @JsonProperty("returnBundles")
    private List<ReturnBundle> returnBundles = null;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("arrivalStationCurrencyCode")
    private String arrivalStationCurrencyCode;
    @JsonProperty("isDomestic")
    private Boolean isDomestic;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("outboundFlights")
    public List<OutboundFlight> getOutboundFlights() {
        return outboundFlights;
    }

    @JsonProperty("outboundFlights")
    public void setOutboundFlights(List<OutboundFlight> outboundFlights) {
        this.outboundFlights = outboundFlights;
    }

    @JsonProperty("returnFlights")
    public List<ReturnFlight> getReturnFlights() {
        return returnFlights;
    }

    @JsonProperty("returnFlights")
    public void setReturnFlights(List<ReturnFlight> returnFlights) {
        this.returnFlights = returnFlights;
    }

    @JsonProperty("outboundBundles")
    public List<OutboundBundle> getOutboundBundles() {
        return outboundBundles;
    }

    @JsonProperty("outboundBundles")
    public void setOutboundBundles(List<OutboundBundle> outboundBundles) {
        this.outboundBundles = outboundBundles;
    }

    @JsonProperty("returnBundles")
    public List<ReturnBundle> getReturnBundles() {
        return returnBundles;
    }

    @JsonProperty("returnBundles")
    public void setReturnBundles(List<ReturnBundle> returnBundles) {
        this.returnBundles = returnBundles;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("arrivalStationCurrencyCode")
    public String getArrivalStationCurrencyCode() {
        return arrivalStationCurrencyCode;
    }

    @JsonProperty("arrivalStationCurrencyCode")
    public void setArrivalStationCurrencyCode(String arrivalStationCurrencyCode) {
        this.arrivalStationCurrencyCode = arrivalStationCurrencyCode;
    }

    @JsonProperty("isDomestic")
    public Boolean getIsDomestic() {
        return isDomestic;
    }

    @JsonProperty("isDomestic")
    public void setIsDomestic(Boolean isDomestic) {
        this.isDomestic = isDomestic;
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
