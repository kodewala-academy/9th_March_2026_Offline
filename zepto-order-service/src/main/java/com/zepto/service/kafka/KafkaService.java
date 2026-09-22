package com.zepto.service.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;

	public void sendMessage(String _topic, String _message) {
		System.out.println("KafkaService.sendMessage() ::::: SENDING MSG TO KAFKA");
		String key = "ORD123";
		kafkaTemplate.send(_topic, key, _message);
	}
}
