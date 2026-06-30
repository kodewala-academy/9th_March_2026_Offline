package com.kodewala.inf4;

public interface IRefund {
	default void pay()
	{
		System.out.println("IRefund.pay()"); // Y
	}
}
