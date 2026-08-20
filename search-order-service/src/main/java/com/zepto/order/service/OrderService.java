package com.zepto.order.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.order.entity.OrderEntity;
import com.zepto.order.exception.OrderDoesNotExistsException;
import com.zepto.order.repository.OrderRepository;
import com.zepto.order.response.OrderResponse;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	public OrderResponse getOrderById(int orderId) {

		System.out.println("OrderService.getOrderById()::::::::::::::::::::: START");

		// OrderEntity entity = orderRepository.findById(orderId).get();

		OrderEntity entity = null;
		OrderResponse response = new OrderResponse();
		try {
			entity = orderRepository.findOrdersByOrderId(orderId);

			response.setId(entity.getId());
			response.setCustomerId(entity.getCustomerId());
			response.setOrderId(entity.getOrderId());
			response.setProductId(entity.getProductId());
			response.setQuantity(entity.getQuantity());
		} catch (Exception e) {

			throw new OrderDoesNotExistsException(" Order id " + orderId + " does not exists");
		}

		System.out.println("OrderService.getOrderById()::::::::::::::::::::: END");

		return response;
	}

	public List<OrderResponse> listOrdersByPayment(String paymentType) {
		System.out.println("OrderService.listOrdersByPayment() :::::::::::::::::START ");
		List<OrderEntity> orderEntities = orderRepository.findOrdersByPaymentType(paymentType);

		List<OrderResponse> response = new ArrayList<OrderResponse>();

		for (OrderEntity entity : orderEntities) {

			OrderResponse orderResponse = new OrderResponse();

			orderResponse.setId(entity.getId());
			orderResponse.setCustomerId(entity.getCustomerId());
			orderResponse.setOrderId(entity.getOrderId());
			orderResponse.setProductId(entity.getProductId());
			orderResponse.setQuantity(entity.getQuantity());

			response.add(orderResponse);
		}
		System.out.println("OrderService.listOrdersByPayment() :::::::::::::::::END ");

		return response;

	}
}
