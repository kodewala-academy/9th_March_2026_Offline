package com.amazon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.amazon.request.OrderRequest;

@Controller
public class OrderController {
	@GetMapping("/orders/{id}")
	public String getOrder(@PathVariable("id") String orderId) {
		System.out.println(" Order id received from page is : " + orderId);
		return "order-details"; // View Resolver
	}

	@PostMapping("placeOrder")
	public String placeOrder(@ModelAttribute OrderRequest orderRequest) 
	{
		
		System.out.println("Item        : " + orderRequest.getItem());
		System.out.println("Price       : " + orderRequest.getPrice());
		System.out.println("Quantity    : " + orderRequest.getQty());
		System.out.println("User        : " + orderRequest.getUser());
		System.out.println("Description : " + orderRequest.getDescription());
		System.out.println("Address     : " + orderRequest.getAddress());
		System.out.println("Mobile      : " + orderRequest.getMobile());

		return "order-confirmation";
	}

}
