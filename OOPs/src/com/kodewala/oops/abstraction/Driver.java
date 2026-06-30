package com.kodewala.oops.abstraction;

public class Driver {

	public static void main(String[] args) {
		
		LoginService loginService = new LoginService();
		
		 loginService.doLogin("myuser", "Test@123");
		
		/*
		 * loginService.connectToDB(); loginService.encryption();
		 * loginService.validateUser();
		 */	}

}
