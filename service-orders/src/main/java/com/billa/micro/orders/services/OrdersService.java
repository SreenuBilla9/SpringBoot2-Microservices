package com.billa.micro.orders.services;

import java.time.LocalDateTime;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.billa.micro.orders.dto.OrderDTO;

@RestController
public class OrdersService {

	@GetMapping("/orders")
	public List<OrderDTO> getOrders() {
		return OrderDTO.getOrders();
	}

	@GetMapping("/orders/{orderid}")
	public OrderDTO getOrderById(@PathParam("orderid") String orderId) {

		OrderDTO o1 = new OrderDTO();
		o1.setOrderId("1");
		o1.setOrderDate(LocalDateTime.now());
		o1.setItemCount(4);

		return o1;
	}

}
