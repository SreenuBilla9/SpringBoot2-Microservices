package com.billa.bank.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {

	@GetMapping("/")
	public String get() {
		return "AccountController - GET method";
	}

	@PostMapping("/")
	public String post() {
		return "AccountController - POST method";
	}

}
