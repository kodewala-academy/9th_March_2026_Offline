package com.amazon.account.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // payment class beans become spring managed bean.
public class Payment {

	@Value("PAYREF65432")
	private String paymentRef;

	public void showPayment() {

		System.out.println("Payment.showPayment()...................... : " + paymentRef);
	}

}
