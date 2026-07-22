package com.amazon.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.account.beans.Account;

@Configuration // This(@Configuration) tells that this class is source of bean definition
public class SpringConfig 
{
 // How do we define the bean?
	@Bean("acc1")
	public Account createAccount1()
	{
		Account account = new Account();
		account.setAccountHolderName("Batch, 9th March");
		account.setAccountNumber("0987654321");
		account.setIfscCode("SBIN87654");
		
		return account;
	}
	@Bean("acc1")
	public Account createAccount2()
	{
		Account account = new Account();
		account.setAccountHolderName("Batch, 9th March");
		account.setAccountNumber("1234567890");
		account.setIfscCode("ICIC87654");
		
		return account;
	}
}
