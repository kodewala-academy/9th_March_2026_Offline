package com.amazon.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PaymentService {

	@Autowired
	@Qualifier("card")
	Payment payment;
	
	public void doPayment()
	{
		payment.pay();
	}
	
	
}
