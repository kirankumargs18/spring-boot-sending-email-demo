package com.globallogic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendMail(String toEmail, String subject, String body) {

		/**
		 * Defining message
		 */

		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("kirangskumar98@gmail.com");
		message.setTo(toEmail);
		message.setSubject(subject);
		message.setText(body);

		/**
		 * Sending mail using JavaMailSender
		 */
		javaMailSender.send(message);
		
		/**
		 * Just to confirm having sysout statement below
		 * */
		System.out.println("Email has been sent successfully............");

	}

}
