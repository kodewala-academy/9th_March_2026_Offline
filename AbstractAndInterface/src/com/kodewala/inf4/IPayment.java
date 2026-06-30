package com.kodewala.inf4;

public interface IPayment { //java 8

	default void pay()
	{
		System.out.println("IPayment.pay()"); // X
	}
	
}
