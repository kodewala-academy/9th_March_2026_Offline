package com.kodewala.inf7;

public interface IPayment { // Functional

	void pay(int amount, String accNo);
	void settle(int amount, String accNo);
}

// (amount, accNo)
