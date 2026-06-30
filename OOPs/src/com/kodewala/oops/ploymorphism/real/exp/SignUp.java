package com.kodewala.oops.ploymorphism.real.exp;

public class SignUp {

	public boolean doRegister(String panCard, int otp) {
		System.out.println("SignUp.doRegister(String panCard, int otp)");
		return true;
	}

	public boolean doRegister(String panCard, String passport) {
		System.out.println("SignUp.doRegister(String panCard, String passport)");
		return true;
	}

	public boolean doRegister(String aadhar) {
		System.out.println("SignUp.doRegister(String aadhar)");
		return true;
	}

}
