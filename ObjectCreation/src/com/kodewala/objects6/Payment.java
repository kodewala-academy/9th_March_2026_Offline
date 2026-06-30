package com.kodewala.objects6;

public class Payment {

	{
		System.out.println(" inside IIB");
	}

	public Payment() {
		// 1 line - super() OR this()
		// 2nd call to init block
		System.out.println(" inside payment() constructor");
	}

	public Payment(int _amt) {
		System.out.println("Payment.Payment(_amt)");
	}

	public static void main(String[] args) {
		System.out.println("Payment.main()");
		Payment payment = new Payment();
		Payment payment1 = new Payment(100);
	}

	static {
		System.out.println(" inside SIB... only once.....");
	}
}
