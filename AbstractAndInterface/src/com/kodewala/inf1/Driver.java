package com.kodewala.inf1;

interface IAccountMgmt
{
	// class --> (What + How) --> abstract class --> what / (what + how) --> interface --> what(100%)
	public void createAccount(); // What ?
	public void modifyAccount(); // What ?
	public void suspendAccount(); // What ?
	public void deleteAccount(); // What ?
}

class RetailUser implements IAccountMgmt
{
	public void createAccount() { // How ?
		
	}
	
	// 

	@Override
	public void modifyAccount() { // How ?
	}

	@Override
	public void suspendAccount() {// How ?
		
	}

	@Override
	public void deleteAccount() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Driver {

	public static void main(String[] args) {
		

	}

}
