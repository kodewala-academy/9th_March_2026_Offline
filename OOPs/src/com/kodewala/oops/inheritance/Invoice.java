package com.kodewala.oops.inheritance;

public class Invoice extends Notifications {

	public void generateInvoice()
	{
		System.out.println("Invoice.generateInvoice()");
		// once invoice is generated, we need to send pdf over email
		
		sendEmail("user123", "Please find attached invoice", "path for attachment");
	}
}
