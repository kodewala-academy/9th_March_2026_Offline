package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.account.beans.Account;
import com.amazon.account.beans.Payment;
import com.amazon.account.config.SpringConfig;
import com.amazon.account.config.SpringConfigAnnotation;

class Person
{
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	
}


public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigAnnotation.class);

		Payment pay = (Payment) context.getBean(Payment.class);

		pay.showPayment();
		
		Person p = new Person("shruti");
		
	}
}
