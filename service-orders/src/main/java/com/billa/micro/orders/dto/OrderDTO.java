package com.billa.micro.orders.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrderDTO {

	private String orderId;
	private LocalDateTime orderDate;
	private Integer itemCount;

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getItemCount() {
		return itemCount;
	}

	public void setItemCount(Integer itemCount) {
		this.itemCount = itemCount;
	}

	public static List<OrderDTO> getOrders() {

		List<OrderDTO> arr = new ArrayList<OrderDTO>();

		OrderDTO o1 = new OrderDTO();
		o1.setOrderId("1");
		o1.setOrderDate(LocalDateTime.now());
		o1.setItemCount(4);
		arr.add(o1);

		o1 = new OrderDTO();
		o1.setOrderId("4");
		o1.setOrderDate(LocalDateTime.now());
		o1.setItemCount(55);
		arr.add(o1);

		o1 = new OrderDTO();
		o1.setOrderId("5");
		o1.setOrderDate(LocalDateTime.now());
		o1.setItemCount(2);
		arr.add(o1);

		o1 = new OrderDTO();
		o1.setOrderId("6");
		o1.setOrderDate(LocalDateTime.now());
		o1.setItemCount(1);
		arr.add(o1);

		return arr;
	}
}
