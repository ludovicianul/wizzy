package com.insidecoding.wizzy.request;

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
@JsonPropertyOrder({ "flightList", "adultCount", "childCount", "infantCount", "wdc" })
public class WizzRequest {

	@JsonProperty("flightList")
	private List<FlightList> flightList = null;
	@JsonProperty("adultCount")
	private Integer adultCount;
	@JsonProperty("childCount")
	private Integer childCount;
	@JsonProperty("infantCount")
	private Integer infantCount;
	@JsonProperty("wdc")
	private Boolean wdc;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("flightList")
	public List<FlightList> getFlightList() {
		return flightList;
	}

	@JsonProperty("flightList")
	public void setFlightList(List<FlightList> flightList) {
		this.flightList = flightList;
	}

	@JsonProperty("adultCount")
	public Integer getAdultCount() {
		return adultCount;
	}

	@JsonProperty("adultCount")
	public void setAdultCount(Integer adultCount) {
		this.adultCount = adultCount;
	}

	@JsonProperty("childCount")
	public Integer getChildCount() {
		return childCount;
	}

	@JsonProperty("childCount")
	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}

	@JsonProperty("infantCount")
	public Integer getInfantCount() {
		return infantCount;
	}

	@JsonProperty("infantCount")
	public void setInfantCount(Integer infantCount) {
		this.infantCount = infantCount;
	}

	@JsonProperty("wdc")
	public Boolean getWdc() {
		return wdc;
	}

	@JsonProperty("wdc")
	public void setWdc(Boolean wdc) {
		this.wdc = wdc;
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