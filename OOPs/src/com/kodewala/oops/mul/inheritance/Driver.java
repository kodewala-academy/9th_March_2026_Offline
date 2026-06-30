package com.kodewala.oops.mul.inheritance;

class Account
{
	public void openAccount(String someDetails )
	{
		System.out.println("Account.openAccount()");
	}
}

class SavingAccount extends Account
{
	public void openAccount(String someDetails )
	{
		System.out.println("SavingAccount.openAccount()");
	}
}

class CurrentAccount extends Account
{
	public void openAccount(String someDetails )
	{
		System.out.println("CurrentAccount.openAccount()");
	}
}

class HybridAccount extends CurrentAccount 
{
	
}

public class Driver {

}
