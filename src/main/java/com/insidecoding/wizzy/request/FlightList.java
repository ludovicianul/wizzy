package com.insidecoding.wizzy.request;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "departureStation", "arrivalStation", "departureDate" })
public class FlightList {

	@JsonProperty("departureStation")
	private String departureStation;
	@JsonProperty("arrivalStation")
	private String arrivalStation;
	@JsonProperty("departureDate")
	private String departureDate;
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

	@JsonProperty("departureDate")
	public String getDepartureDate() {
		return departureDate;
	}

	@JsonProperty("departureDate")
	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
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