package com.amazon.account.beans;

public class Account {
	private String accountHolderName;
	private String ifscCode;
	private String accountNumber;

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public void displayAccountInfo() {
		System.out.println("Account [accountHolderName=" + accountHolderName + ", ifscCode=" + ifscCode
				+ ", accountNumber=" + accountNumber + "]");
	}

}
