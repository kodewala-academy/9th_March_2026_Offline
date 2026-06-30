package com.kodewala.app;

public class SwitchExp2 {

	public static void main(String[] args) {

		String customerType = "silver";

		switch (customerType) {
		case "silver":
			calculateDiscount(0);
			break;
		case "gold":
			calculateDiscount(10);
			break;
		case "platinum":
			calculateDiscount(15);
			break;
		default:
			System.out.println(" Unknown type!");
			break;
		}

	}

	public static void calculateDiscount(int discount) {
		System.out.println(" Discount is " + discount + "%");
	}

}
