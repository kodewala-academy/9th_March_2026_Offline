package com.amazon.di.setter.address;

public class Address {
	private String line1;
	private String line2;
	private String city;
	private String state;

	public Address(String line1, String line2, String city, String state) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
	}

	public void displayAddressInfo() {
		System.out
				.println("Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state=" + state + "]");
	}

}
