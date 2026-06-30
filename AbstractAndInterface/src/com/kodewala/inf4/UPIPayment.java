package com.kodewala.inf4;

public class UPIPayment  implements IPayment , IRefund {

	@Override
	public void pay() // X or X
	{
		IPayment.super.pay();// X
	}
}
