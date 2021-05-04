package com.billa.bank.transaction.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transactions")
public class TransactionController {

	@GetMapping("/")
	public String get() {
		return "TransactionController - GET method";
	}

	@PostMapping("/")
	public String post() {
		return "TransactionController - POST method";
	}

}
