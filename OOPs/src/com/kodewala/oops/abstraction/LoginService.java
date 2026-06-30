package com.kodewala.oops.abstraction;

public class LoginService {

	public boolean doLogin(String userId, String _pwd) {
		// connect with databases
		// Do encryption / decryption
		// business logic to validate users

		connectToDB();

		encryption();

		promptPasswordReset();

		validateUser();

		return true;
	}

	private void connectToDB() {
		System.out.println("LoginService.connectToDB().....");
	}

	private void encryption() {
		System.out.println("LoginService.encryption()");
	}

	private void validateUser() {
		System.out.println("LoginService.validateUser()");
	}

	private void promptPasswordReset() {
		System.out.println("LoginService.promptPasswordReset()");
	}
}
