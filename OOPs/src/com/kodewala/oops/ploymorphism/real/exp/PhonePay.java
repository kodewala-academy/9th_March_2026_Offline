package com.kodewala.oops.ploymorphism.real.exp;

public class PhonePay extends Payment {

	@Override
	public void doPayment() {
		System.out.println("PhonePay.doPayment()");
	}
}
