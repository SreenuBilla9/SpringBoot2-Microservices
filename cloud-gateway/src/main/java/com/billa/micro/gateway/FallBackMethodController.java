package com.billa.micro.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/generalFallback")
	public String generalFallback() {
		return "Service is down";
	}

	@GetMapping("/csFallback")
	public String customerServiceFallBackMethod() {
		return "Customer Service is down";
	}

	@GetMapping("/asFallback")
	public String accountServiceFallBackMethod() {
		return "Account Service is down";
	}
}
