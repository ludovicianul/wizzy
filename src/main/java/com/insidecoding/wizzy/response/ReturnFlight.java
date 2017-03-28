
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
    "departureStation",
    "arrivalStation",
    "carrierCode",
    "flightNumber",
    "flightSellKey",
    "departureDateTime",
    "arrivalDateTime",
    "fares",
    "infantLimitExceeded",
    "wheelchairLimitExceeded",
    "oxyLimitExceeded",
    "sportsEquipmentLimitExceeded"
})
public class ReturnFlight {

    @JsonProperty("departureStation")
    private String departureStation;
    @JsonProperty("arrivalStation")
    private String arrivalStation;
    @JsonProperty("carrierCode")
    private String carrierCode;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("flightSellKey")
    private String flightSellKey;
    @JsonProperty("departureDateTime")
    private String departureDateTime;
    @JsonProperty("arrivalDateTime")
    private String arrivalDateTime;
    @JsonProperty("fares")
    private List<Fare> fares = null;
    @JsonProperty("infantLimitExceeded")
    private InfantLimitExceeded_ infantLimitExceeded;
    @JsonProperty("wheelchairLimitExceeded")
    private WheelchairLimitExceeded_ wheelchairLimitExceeded;
    @JsonProperty("oxyLimitExceeded")
    private OxyLimitExceeded_ oxyLimitExceeded;
    @JsonProperty("sportsEquipmentLimitExceeded")
    private SportsEquipmentLimitExceeded_ sportsEquipmentLimitExceeded;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("departureStation")
    public String getDepartureStation() {
        return departureStation;
    }

    @JsonProperty("departureStation")
    public void setDepartureStation(String departureStation) {
        this.departureStation = departureStation;
    }

    @JsonProperty("arrivalStation")
    public String getArrivalStation() {
        return arrivalStation;
    }

    @JsonProperty("arrivalStation")
    public void setArrivalStation(String arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    @JsonProperty("carrierCode")
    public String getCarrierCode() {
        return carrierCode;
    }

    @JsonProperty("carrierCode")
    public void setCarrierCode(String carrierCode) {
        this.carrierCode = carrierCode;
    }

    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("flightSellKey")
    public String getFlightSellKey() {
        return flightSellKey;
    }

    @JsonProperty("flightSellKey")
    public void setFlightSellKey(String flightSellKey) {
        this.flightSellKey = flightSellKey;
    }

    @JsonProperty("departureDateTime")
    public String getDepartureDateTime() {
        return departureDateTime;
    }

    @JsonProperty("departureDateTime")
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    @JsonProperty("arrivalDateTime")
    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    @JsonProperty("arrivalDateTime")
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    @JsonProperty("fares")
    public List<Fare> getFares() {
        return fares;
    }

    @JsonProperty("fares")
    public void setFares(List<Fare> fares) {
        this.fares = fares;
    }

    @JsonProperty("infantLimitExceeded")
    public InfantLimitExceeded_ getInfantLimitExceeded() {
        return infantLimitExceeded;
    }

    @JsonProperty("infantLimitExceeded")
    public void setInfantLimitExceeded(InfantLimitExceeded_ infantLimitExceeded) {
        this.infantLimitExceeded = infantLimitExceeded;
    }

    @JsonProperty("wheelchairLimitExceeded")
    public WheelchairLimitExceeded_ getWheelchairLimitExceeded() {
        return wheelchairLimitExceeded;
    }

    @JsonProperty("wheelchairLimitExceeded")
    public void setWheelchairLimitExceeded(WheelchairLimitExceeded_ wheelchairLimitExceeded) {
        this.wheelchairLimitExceeded = wheelchairLimitExceeded;
    }

    @JsonProperty("oxyLimitExceeded")
    public OxyLimitExceeded_ getOxyLimitExceeded() {
        return oxyLimitExceeded;
    }

    @JsonProperty("oxyLimitExceeded")
    public void setOxyLimitExceeded(OxyLimitExceeded_ oxyLimitExceeded) {
        this.oxyLimitExceeded = oxyLimitExceeded;
    }

    @JsonProperty("sportsEquipmentLimitExceeded")
    public SportsEquipmentLimitExceeded_ getSportsEquipmentLimitExceeded() {
        return sportsEquipmentLimitExceeded;
    }

    @JsonProperty("sportsEquipmentLimitExceeded")
    public void setSportsEquipmentLimitExceeded(SportsEquipmentLimitExceeded_ sportsEquipmentLimitExceeded) {
        this.sportsEquipmentLimitExceeded = sportsEquipmentLimitExceeded;
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
