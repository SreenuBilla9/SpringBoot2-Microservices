package com.billa.bank.customer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

	@GetMapping("/")
	public String getUser() {
		return "CustomerService - GET method";
	}

	@PostMapping("/")
	public String postUser() {
		return "CustomerService - POST method";
	}

}
