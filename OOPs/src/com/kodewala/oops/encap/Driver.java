package com.kodewala.oops.encap;

public class Driver {

	public static void main(String[] args) {

		Account account = new Account();

	//	account.balance=1000000;
		account.deposit(1200);

		System.out.println(account.getBalance());

	}

}
