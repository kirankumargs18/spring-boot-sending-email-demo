package com.globallogic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.globallogic.entity.Order;
import com.globallogic.repository.OrderRepository;
import com.globallogic.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	// To get order from database
	@Autowired
	private OrderRepository orderRepository;

	// To send a email we need this
	@Autowired
	private JavaMailSender mailSender;

	@Override
	public String placeOrder() {

		// get order details from database
		Order order = orderRepository.findById((long) 1).get();

		// set email message
		SimpleMailMessage message = new SimpleMailMessage();

		message.setFrom("kirangskumar98@gmail.com");
		message.setTo(order.getCustomer().getEmailId());
		message.setSubject("Order Placed");
		message.setText("Thank for placing the order.\n" + "Here is your order details.\n" + order.getProduct());
		
		//send email to customer
		mailSender.send(message);

		return "Email has been sent successfully, please check your email for details";
	}

}
