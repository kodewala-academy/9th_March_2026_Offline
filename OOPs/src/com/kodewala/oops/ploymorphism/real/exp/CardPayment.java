package com.kodewala.oops.ploymorphism.real.exp;

public class CardPayment extends Payment {

	@Override
	public void doPayment() {
		System.out.println("CardPayment.doPayment()");
	}

}
