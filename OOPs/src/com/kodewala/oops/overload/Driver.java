package com.kodewala.oops.overload;

class LoginService {

	 void doLogin(String mobile, int otp) // Same Method Name + (Order of args OR Type of Args OR Number of args)
	{
		System.out.println("LoginService.doLogin(String mobile , int otp)");
	}

	public void doLogin(int otp, String mobile) // Order of args OR Type of Args OR Number of args
	{
		System.out.println("LoginService.doLogin(int otp,String mobile)");
	}

	public void doLogin(String aadhar, int otp, String pan) {
		System.out.println("LoginService.doLogin(String aadhar , int otp, String pan)");
	}

	public void doLogin(String pan, String passport) {
		System.out.println("LoginService.doLogin(String pan , String passport)");
	}

}

public class Driver {

	public static void main(String[] args) {
		LoginService loginService = new LoginService();

		loginService.doLogin(2134, "523534534");

	}

}
