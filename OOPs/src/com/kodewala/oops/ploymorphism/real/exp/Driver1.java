package com.kodewala.oops.ploymorphism.real.exp;

public class Driver1 {

	public static void main(String[] args) {
		
		SignUp signUp = new  SignUp();
		
		signUp.doRegister("5234-5432-5646"); // compile time polymorphism 

		signUp.doRegister("AOgsg342B", 12345); // 
	}

}
