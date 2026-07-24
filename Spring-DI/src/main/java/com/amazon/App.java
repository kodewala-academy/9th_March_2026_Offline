package com.amazon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.config.SpringConfig;
import com.amazon.di.constructor.emp.Employee;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

		com.amazon.di.setter.emp.Employee e1 = (com.amazon.di.setter.emp.Employee) context.getBean("emp2");

		e1.printInfo();
	}
}
