package com.insidecoding.wizzy.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Component;

@Component
public class EmailService {

	private static final Logger LOG = LoggerFactory.getLogger(EmailService.class);

	@Autowired
	private MailSender sender;

	@Value("${notify.to}")
	private String notifyTo;

	public void sendEmail(String body) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(notifyTo);
		message.setSubject("Wizz price alert!");
		message.setText(body);

		sender.send(message);

		LOG.info("email success");
	}
}
