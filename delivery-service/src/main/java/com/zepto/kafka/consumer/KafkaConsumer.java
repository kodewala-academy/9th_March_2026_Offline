package com.zepto.kafka.consumer;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

	@KafkaListener(topics = "order-all-status" , groupId = "DG1")
	public void consume(ConsumerRecord<String, String> record)
	{
		System.out.println("Partition : "+record.partition());
		System.out.println("Offset : "+record.offset());
		System.out.println(" Key : " +record.key());
		System.out.println(" Value : "+record.value());
	}
	
}
