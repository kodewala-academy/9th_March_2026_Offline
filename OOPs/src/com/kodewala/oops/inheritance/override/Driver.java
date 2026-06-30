package com.kodewala.oops.inheritance.override;

class PaymentSystem // Super class of UPI
{
	Parent doPayment(String accNo, int amount, String note) {
		System.out.println("PaymentSystem.doPayment()........");

		return new Parent();
	}
}

class UPI extends PaymentSystem {
	@Override // check all the rules for overriding...
	protected Child doPayment(String accNo, int amount, String note) {
		// change the functionalities...
		System.out.println("UPI.doPayment()");
		return new Child();
	}
}

public class Driver {

}
