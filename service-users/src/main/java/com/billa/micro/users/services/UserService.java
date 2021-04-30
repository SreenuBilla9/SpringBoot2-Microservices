package com.billa.micro.users.services;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.billa.micro.users.dto.UserDTO;
import com.billa.micro.users.dto.UserOrderDTO;

@RestController
public class UserService {

	@GetMapping("/users")
	public UserDTO[] getUsers() {
		return UserDTO.getUsers();
	}

	@GetMapping("/users/{userid}")
	public UserDTO getUser(@PathParam("userid") String name) {

		UserDTO dto = new UserDTO();
		dto.setUserid("1");
		dto.setName("BSR");
		dto.setIsValid("Yes");
		return dto;
	}

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/users/orders/{userid}")
	public UserOrderDTO getOrderByUser(@PathParam("userid") String name) {
		return restTemplate.getForObject("http://ORDERS-SERVICE/OrdersService/orders/1", UserOrderDTO.class);
	}

	@GetMapping("/users/hello")
	public String getStr() {
		return "Hello World";
	}

}
