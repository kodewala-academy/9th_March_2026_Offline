package com.kodewala.objects;

class Payment {

	int amount; // fields
	String txnNote;

	public Payment(int _amount, String _txnNote) {
		System.out.println(" Calling Payment(int _amount, String _txnNote)....");
		// init
		this.amount = _amount;
		this.txnNote = _txnNote;
	}
}

public class Driver {

	public static void main(String[] args) {

		Payment p0 = new Payment(1000, "Credit card bill pay"); // Calling Payment() constructor.
	
		System.out.println(" p0 --> " + p0.amount);
		System.out.println(" p0 --> " + p0.txnNote);
			
		Payment p1 = new Payment(800, "paying phone bill"); // Calling Payment() constructor.
		System.out.println(" p1 --> " + p1.amount);
		System.out.println(" p1 --> " + p1.txnNote);
	}

}
