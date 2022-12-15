package com.globallogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailDemoWithSpringBootApplication {

	@Autowired
	private EmailSenderService senderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailDemoWithSpringBootApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail() {

		senderService.sendMail("kirangskumar98@gmail.com", "From Spring Boot App",
				"You are getting this message from spring boot mail demo project");

	}

}
