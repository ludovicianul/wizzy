package com.insidecoding.wizzy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.insidecoding.wizzy.service.WizzService;

@SpringBootApplication
public class Wizzy implements CommandLineRunner {
	private static final Logger LOG = LoggerFactory.getLogger(Wizzy.class);

	@Autowired
	private WizzService wizzService;

	public static void main(String[] args) throws Exception {
		new SpringApplicationBuilder(Wizzy.class).bannerMode(Banner.Mode.CONSOLE).build().run(args);
	}

	@Override
	public void run(String... arg0) {
		try {
			wizzService.checkPrice();
		} catch (Exception e) {
			LOG.warn("Something went wrong while checking the prices {}", e.getMessage());
		}

	}

}
