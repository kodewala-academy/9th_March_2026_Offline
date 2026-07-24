package com.amazon.di.setter.emp;

import com.amazon.di.setter.address.Address;

public class Employee {

	private int salary;
	private String name;

	private Address address;

	public Employee(int salary, String name) {
		super();
		this.salary = salary;
		this.name = name;
	}

	public void setAddress(Address _address) {
		this.address = _address;
	}

	public void printInfo() {
		address.displayAddressInfo();
	}

}
