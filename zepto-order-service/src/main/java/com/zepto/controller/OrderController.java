package com.zepto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.request.OrderRequest;
import com.zepto.order.response.OrderResponse;
import com.zepto.service.OrderService;

@RestController
@RequestMapping("order/")
public class OrderController {
	@Autowired
	OrderService orderService;

	@PostMapping("place")
	public OrderResponse placeOrder(@RequestBody OrderRequest orderRequest) {
		System.out.println("OrderController.placeOrder():::::::::::::::::::::::::::: START");
		OrderResponse orderResponse = orderService.acceptOrder(orderRequest);
		System.out.println("OrderController.placeOrder():::::::::::::::::::::::::::: END");
		return orderResponse;
	}

}
