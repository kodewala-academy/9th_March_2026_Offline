package com.kodewala.sample;

class Account
{
	public void doTransfer() {
		
	}
}


public class Testing {
	public static void main(String[] args) 
	{
		Account acc = new Account(); // creating an object
		acc.doTransfer();  // using the object
		acc = null; // nullify the object

	}
}
