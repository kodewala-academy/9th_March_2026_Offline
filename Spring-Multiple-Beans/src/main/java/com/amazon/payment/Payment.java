package com.amazon.payment;

public class Payment {

	private String refId;

	public Payment(String refId) {
		super();
		this.refId = refId;
	}

	public void pay() 
	{
		System.out.println("Payment.pay()...." + refId);
	}

}
