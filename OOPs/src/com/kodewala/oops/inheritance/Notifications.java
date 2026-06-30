package com.kodewala.oops.inheritance;

public class Notifications {

	String countryName = "India"; // Field OR Attribute --> Data
    private String hostName="send.email.192.162.1.0";
    
	public void sendEmail(String email, String text, String attachment) // Work OR Task
	{
		connectToEmailServer();
		System.out.println("Notifications.sendEmail()");
	}

	public void sendSMS(String mobile, String text) {
		System.out.println("Notifications.sendSMS()");
	}

	private void connectToEmailServer() {
		System.out.println("Notifications.connectToEmailServer()");
	}
}
