package com.kodewala.jdbc;

import java.sql.SQLException;

public class App
{
	public static void main(String[] args)
	{
		PaymentService paymentService = new PaymentService();
		try
		{
			//paymentService.getAllPayments("failed");
			paymentService.updatePaymentStatus(10002, "on-hold");
			
		} catch (ClassNotFoundException | SQLException e)
		{
			
			e.printStackTrace();
		}
	}
}
