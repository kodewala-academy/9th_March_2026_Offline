package com.kodewala;

abstract class PaymentSystem // (Abstract) + (Non-Abstract - Method with body)
{
	public abstract void pay(); // What ?

	public abstract void doKYC();

	public void stopCheque() // Non-Abstract - Method with body
	{
		System.out.println("PaymentSystem.stopCheque()");
	}

	PaymentSystem()
	{
		super();
	}
	
}

class HDFC extends PaymentSystem {
	@Override
	public void pay() {
		System.out.println("HDFC.pay()"); // How ?
	}

	@Override
	public void doKYC() {
		System.out.println("HDFC.doKYC()");
	}
	HDFC()
	{
		super();
	}
}

public class Driver {

	public static void main(String[] args) {
		HDFC HDFC = new HDFC(); 
	}

}
