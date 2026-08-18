package com.zepto.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.order.entity.OrderEntity;
import com.zepto.order.repository.OrderRepository;
import com.zepto.order.response.OrderResponse;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public OrderResponse getOrderById(int orderId) {
		
		System.out.println("OrderService.getOrderById()::::::::::::::::::::: START");
		
	//	OrderEntity entity = orderRepository.findById(orderId).get();

		OrderEntity entity = orderRepository.findOrdersByOrderId(orderId);
		
		
		OrderResponse response = new OrderResponse();
		response.setId(entity.getId());
		response.setCustomerId(entity.getCustomerId());
		response.setOrderId(entity.getOrderId());
		response.setProductId(entity.getProductId());
		response.setQuantity(entity.getQuantity());
		
		System.out.println("OrderService.getOrderById()::::::::::::::::::::: END");
		
		return response;
	}
}
