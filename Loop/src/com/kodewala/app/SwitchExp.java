package com.kodewala.app;

public class SwitchExp {

	public static void main(String[] args) {

		String day = "forth";

		switch (day) {
		case "first":
			System.out.println("MON");
			break;
		case "second":
			System.out.println("TUE");
			break;
		case "third":
			System.out.println("WEB");
			break;
		default:
			System.out.println(" Unknown day!");
			break;
		}

	}

}
