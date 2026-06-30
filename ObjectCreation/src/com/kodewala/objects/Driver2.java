package com.kodewala.objects;

class Account {
	int balance;
	String accountHolder;
	
	 Account(int _balance, String _accountHolder)
	{
		 this.balance = _balance;
		 this.accountHolder = _accountHolder;
	}
}

public class Driver2 {

	public static void main(String[] args) {
		Account acc = new Account(1200, "Kodewala"); //  
		
		System.out.println(acc.balance); //
		System.out.println(acc.accountHolder); //
	}

}
