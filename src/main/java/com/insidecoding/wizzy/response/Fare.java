
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
    "fareSellKey",
    "administrationFeePrice",
    "basePrice",
    "discountedPrice",
    "fullBasePrice",
    "bundle",
    "fareDiscountType",
    "wdc",
    "availableCount"
})
public class Fare {

    @JsonProperty("fareSellKey")
    private String fareSellKey;
    @JsonProperty("administrationFeePrice")
    private AdministrationFeePrice administrationFeePrice;
    @JsonProperty("basePrice")
    private BasePrice basePrice;
    @JsonProperty("discountedPrice")
    private DiscountedPrice discountedPrice;
    @JsonProperty("fullBasePrice")
    private FullBasePrice fullBasePrice;
    @JsonProperty("bundle")
    private String bundle;
    @JsonProperty("fareDiscountType")
    private String fareDiscountType;
    @JsonProperty("wdc")
    private Boolean wdc;
    @JsonProperty("availableCount")
    private Integer availableCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fareSellKey")
    public String getFareSellKey() {
        return fareSellKey;
    }

    @JsonProperty("fareSellKey")
    public void setFareSellKey(String fareSellKey) {
        this.fareSellKey = fareSellKey;
    }

    @JsonProperty("administrationFeePrice")
    public AdministrationFeePrice getAdministrationFeePrice() {
        return administrationFeePrice;
    }

    @JsonProperty("administrationFeePrice")
    public void setAdministrationFeePrice(AdministrationFeePrice administrationFeePrice) {
        this.administrationFeePrice = administrationFeePrice;
    }

    @JsonProperty("basePrice")
    public BasePrice getBasePrice() {
        return basePrice;
    }

    @JsonProperty("basePrice")
    public void setBasePrice(BasePrice basePrice) {
        this.basePrice = basePrice;
    }

    @JsonProperty("discountedPrice")
    public DiscountedPrice getDiscountedPrice() {
        return discountedPrice;
    }

    @JsonProperty("discountedPrice")
    public void setDiscountedPrice(DiscountedPrice discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    @JsonProperty("fullBasePrice")
    public FullBasePrice getFullBasePrice() {
        return fullBasePrice;
    }

    @JsonProperty("fullBasePrice")
    public void setFullBasePrice(FullBasePrice fullBasePrice) {
        this.fullBasePrice = fullBasePrice;
    }

    @JsonProperty("bundle")
    public String getBundle() {
        return bundle;
    }

    @JsonProperty("bundle")
    public void setBundle(String bundle) {
        this.bundle = bundle;
    }

    @JsonProperty("fareDiscountType")
    public String getFareDiscountType() {
        return fareDiscountType;
    }

    @JsonProperty("fareDiscountType")
    public void setFareDiscountType(String fareDiscountType) {
        this.fareDiscountType = fareDiscountType;
    }

    @JsonProperty("wdc")
    public Boolean getWdc() {
        return wdc;
    }

    @JsonProperty("wdc")
    public void setWdc(Boolean wdc) {
        this.wdc = wdc;
    }

    @JsonProperty("availableCount")
    public Integer getAvailableCount() {
        return availableCount;
    }

    @JsonProperty("availableCount")
    public void setAvailableCount(Integer availableCount) {
        this.availableCount = availableCount;
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
