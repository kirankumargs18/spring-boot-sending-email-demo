package com.globallogic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globallogic.service.OrderService;

@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@GetMapping("/placeorder")
	public ResponseEntity<String> placesOrderAndSendsEmail() {
		return new ResponseEntity<String>(orderService.placeOrder(), HttpStatus.OK);
	}

}
