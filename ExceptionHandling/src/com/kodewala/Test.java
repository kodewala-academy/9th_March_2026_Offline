package com.kodewala;

public class Test {
	static int someValue;

	public static void main(String[] args) { // +ve --> Happy Scenario

		System.out.println(" This is sample program - START");

		String name = null;

		try {
			int amount = 200 / 0;

			System.out.println(" Amount " + amount);
			System.out.println(" Before Exception");

			System.out.println(" length " + name.length());// Risky --> may throw an Exception

			System.out.println(" After Exception");// skipped in case of NPE

		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(" Name is null...."); // Message
		}
		catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println(" can not divide by zero."); // Message
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(" Something went wrong!");
		}
        System.out.println(" Placing order now!!!!"); 
		System.out.println(" This is sample program - END");
	}

}
