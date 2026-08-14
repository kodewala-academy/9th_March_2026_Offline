package com.zepto.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.order.request.OrderRequest;
import com.zepto.order.response.OrderResponse;
import com.zepto.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public OrderResponse acceptOrder(OrderRequest orderRequest) {
		System.out.println("OrderService.acceptOrder() ::::: START");

		OrderEntity entity = new OrderEntity();

		entity.setCustomerId(orderRequest.getCustomerId());
		entity.setPaymentMethod(orderRequest.getPaymentMethod());
		entity.setProductId(orderRequest.getProductId());
		entity.setQuantity(orderRequest.getQuantity());
		entity.setShippingAddress(orderRequest.getShippingAddress());

		// Biz logic
		entity.setOrderId(generateOrderID());

		OrderEntity responseEntity = orderRepository.save(entity);

		OrderResponse orderResponse = new OrderResponse();

		orderResponse.setOrderId(responseEntity.getOrderId());
		orderResponse.setCustomerId(responseEntity.getCustomerId());
		orderResponse.setTotalAmount(2312);
		orderResponse.setPaymentStatus("SUCCESS");
		orderResponse.setOrderStatus("PLACED");
		
		System.out.println("OrderService.acceptOrder() ::::: END");

		return orderResponse;
	}

	private int generateOrderID() {
		Random random = new Random();
		int id = 10000 + random.nextInt(90000);
		return id;
	}

}
