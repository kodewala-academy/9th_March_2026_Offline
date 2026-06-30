package com.kodewala.oops.inheritance;

class AccountMgmt // Parent of Account class
{
	String ifscCode = "SBIN00001";

	public void doFundTransfer() {
		System.out.println("AccountMgmt.doFundTransfer().. 500 lines "); // 15 days
	}
}

class Account extends AccountMgmt // Account class is Child of AccountMgmt
{

	//
	public void pay() {
		Account account = new Account();
		System.out.println(account.ifscCode); // re-using the parent class attributes in child class
		account.doFundTransfer(); // we are re-using parent class method
	}
}

public class Driver {

	public static void main(String[] args) {

	}

}
