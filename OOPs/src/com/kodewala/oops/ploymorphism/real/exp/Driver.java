package com.kodewala.oops.ploymorphism.real.exp;

public class Driver {

	public static void main(String[] args) {

		PaymentProcessor processor = new PaymentProcessor();

		Payment payment = new Payment();
		processor.processPayment(payment);

		PhonePay phonePay = new PhonePay();

		processor.processPayment(phonePay);

	}

}
