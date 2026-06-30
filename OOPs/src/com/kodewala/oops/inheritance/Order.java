package com.kodewala.oops.inheritance;

public class Order extends Notifications { // Notifications is a parent for Order class

	public void placeOrder(String userId, String productID, String someOtherInfo)
	{
		System.out.println("Order.placeOrder()");
		// Once order placed, System/platform need to send an update over email/sms
	
		String text = "You order has been successfully placed.";
		sendEmail(userId, text, null); // parent class method i am able to use.
	    System.out.println(countryName);
	}
	
	
}
