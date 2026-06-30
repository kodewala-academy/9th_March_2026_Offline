package com.kodewala.oops.ploymorphism.real.exp;

public class Test {

	static int someVariable = 100; // Metaspace(permgen)
	int amount;

	{
		// // increase the count
	}

	public Test(int amount) {
		super();
		this.amount = amount;

	}

	public Test(int amount, int balance) {
		super();
		this.amount = amount;

	}

	Test() {

	}

	public static void main(String[] args) {

		Test test = new Test(200);

		String valueFromCmd = args[0];
		System.out.println("Test.main().. " + valueFromCmd);
	}

}
