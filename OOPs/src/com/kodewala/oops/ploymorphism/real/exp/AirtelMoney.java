package com.kodewala.oops.ploymorphism.real.exp;

public class AirtelMoney extends Payment {

	@Override
	public void doPayment() {
		System.out.println("AirtelMoney.doPayment()");
	}

}
