package com.kodewala.oops;

public class Driver {

	public static void main(String[] args) {
		Account account = new Account();

	// 	account.balance= - 10000000;
		
		account.setBalance(-1000000);
		System.out.println(account.getBalance());
	}
}
