package com.insidecoding.wizzy.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.insidecoding.wizzy.request.FlightList;
import com.insidecoding.wizzy.request.WizzRequest;
import com.insidecoding.wizzy.response.Fare;
import com.insidecoding.wizzy.response.OutboundFlight;
import com.insidecoding.wizzy.response.ReturnFlight;
import com.insidecoding.wizzy.response.WizzResponse;

@Component
public class WizzService {
	private static final Logger LOG = LoggerFactory.getLogger(WizzService.class);

	@Autowired
	private EmailService emailService;

	@Value("${api.url}")
	private String apiUrl;

	@Value("${dateFrom}")
	private String dateFrom;

	@Value("${dateTo}")
	private String dateTo;

	@Value("${from}")
	private String from;

	@Value("${to}")
	private String to;

	@Value("${adults:1}")
	private String adults;

	@Value("${childs:0}")
	private String childs;

	public void checkPrice() throws WizzException, IOException {
		RestTemplate rest = new RestTemplate();
		rest.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<>();
		headers.set("Accept", "*/*");
		headers.set("Content-Type", "application/json");

		HttpEntity<WizzRequest> entity = new HttpEntity<>(this.getReq(), headers);

		LOG.info("Start calling wizzair api {} with request {} -> {}, {} -> {}, adults {}, childs {}", apiUrl, from, to,
				dateFrom, dateTo, adults, childs);
		WizzResponse response = rest.postForEntity(apiUrl, entity, WizzResponse.class).getBody();
		LOG.info("Finish calling wizz api! Check your email!");
		String emailBody = this.getEmailBody(response);
		emailService.sendEmail(emailBody);
	}

	private WizzRequest getReq() {
		WizzRequest request = new WizzRequest();
		request.setAdultCount(Integer.parseInt(adults));
		request.setChildCount(Integer.parseInt(childs));
		request.setWdc(true);
		List<FlightList> flights = new ArrayList<>();

		flights.add(getFlight(from, to, dateFrom));
		flights.add(getFlight(to, from, dateTo));

		request.setFlightList(flights);

		return request;
	}

	private static FlightList getFlight(String fromStation, String toStation, String departureDate) {
		FlightList toFlightList = new FlightList();
		toFlightList.setDepartureStation(fromStation);
		toFlightList.setArrivalStation(toStation);
		toFlightList.setDepartureDate(departureDate);
		return toFlightList;
	}

	private String getEmailBody(WizzResponse response) throws WizzException, IOException {
		StringBuilder builder = new StringBuilder();

		if (response.getOutboundFlights().isEmpty()) {
			builder.append(from + " -> " + to + ": no departure for the date " + dateFrom);
		} else {
			OutboundFlight outbound = response.getOutboundFlights().get(0);
			builder.append(from + " -> " + to + " \n").append(this.getFare(outbound.getFares().get(0)));
		}

		if (response.getReturnFlights().isEmpty()) {
			builder.append("\n" + from + " -> " + to + ": no return flight for the date " + dateTo);
		} else {
			ReturnFlight back = response.getReturnFlights().get(0);
			builder.append("\n" + to + " -> " + from + "\n").append(this.getFare(back.getFares().get(0)));
		}

		return builder.toString();
	}

	private String getFare(Fare base) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		StringBuilder builder = new StringBuilder();
		builder.append("Base price: ").append(mapper.writeValueAsString(base.getBasePrice()))
				.append(", Discounted price: ").append(mapper.writeValueAsString(base.getDiscountedPrice()))
				.append(", Full Base price: ").append(mapper.writeValueAsString(base.getFullBasePrice()));
		return builder.toString();
	}
}
