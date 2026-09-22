package com.zepto.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zepto.entity.OrderEntity;
import com.zepto.entity.PaymentEntity;
import com.zepto.order.request.OrderRequest;
import com.zepto.order.response.OrderResponse;
import com.zepto.payment.repository.PaymentRepository;
import com.zepto.repository.OrderRepository;
import com.zepto.service.kafka.KafkaService;

import jakarta.transaction.Transactional;
import tools.jackson.databind.ObjectMapper;

@Service
public class OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	PaymentRepository paymentRepository;

	@Autowired
	KafkaService kafkaService;

	@Transactional
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

		// Creating the Order - Instruction #1
		OrderEntity responseEntity = orderRepository.save(entity);

		// Confirm the payment... Instruction #2
		PaymentEntity paymentEntity = new PaymentEntity();
		int amount = generateAmount();
		paymentEntity.setAmount(amount);
		paymentEntity.setPaymentRef(generatePaymentRef());
		paymentEntity.setStatus("PAID");
		// Creating exception scenario --
		String something = null;
		OrderResponse orderResponse = new OrderResponse();

		PaymentEntity responsePaymentEntity = paymentRepository.save(paymentEntity);

		/*
		 * if (something.equals("nothing")) // NPE {
		 * System.out.println("this is dummy code..."); }
		 */
		if (responsePaymentEntity.getId() > 0) {

			orderResponse.setOrderId(responseEntity.getOrderId());
			orderResponse.setCustomerId(responseEntity.getCustomerId());
			orderResponse.setTotalAmount(amount);
			orderResponse.setPaymentStatus("SUCCESS");
			orderResponse.setOrderStatus("PLACED");
		} else {
			orderResponse.setOrderId(responseEntity.getOrderId());
			orderResponse.setCustomerId(responseEntity.getCustomerId());
			orderResponse.setTotalAmount(amount);
			orderResponse.setPaymentStatus("FAILED");
			orderResponse.setOrderStatus("ON HOLD");
		}
		System.out.println("OrderService.acceptOrder() ::::: END");


		if (responsePaymentEntity.getStatus().equalsIgnoreCase("paid")) {
			System.out.println("OrderService.acceptOrder().... order paid. sending message to kafka");
			String data = objToJson(orderResponse);
			for (int i = 0; i < 1000; i++) {
			
			kafkaService.sendMessage("order-all-status", data + " message # "+i);
			
			
			}
		}
		
		
		return orderResponse;
	}

	private int generateOrderID() {
		Random random = new Random();
		int id = 10000 + random.nextInt(90000);
		return id;
	}

	private int generateAmount() {
		Random random = new Random();
		int amount = 1000 + random.nextInt(9000);
		return amount;
	}

	private String generatePaymentRef() {
		Random random = new Random();
		String ref = "REF" + 100 + random.nextInt(900);
		return ref;
	}
	
	private String objToJson(OrderResponse response)
	{
		  ObjectMapper objectMapper = new ObjectMapper();

	        String json = objectMapper.writeValueAsString(response);
	        return json;
	}

}
