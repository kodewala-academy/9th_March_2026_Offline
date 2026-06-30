package com.kodewala.oops.encap;

public class Account {

	private int balance = 1000; // Data

	// Setter
	public void deposit(int _amount) {
		if (_amount > 0) {
			balance = balance + _amount;
		} else {
			System.err.println(" Invalid amount");
		}
	}

	public int getBalance() {
		return balance;
	}

}
