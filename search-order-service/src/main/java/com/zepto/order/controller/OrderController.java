package com.zepto.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zepto.order.response.OrderResponse;
import com.zepto.order.service.OrderService;

@RequestMapping("orders/")
@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@GetMapping("findOrder")
	public OrderResponse searchOrderById(@RequestParam("id") int id)
	{
		return  orderService.getOrderById(id);
	}
	
}
