package com.kodewala.inf2;

// 2010(1.6) --> 2012(wanted new feature 'printPassBook')
interface IBanking {
	void pay(); // 2010

	void settle(); // 2010

	void cancelTxn(); // 2010

	public default void printPassBook() // Only rural bank need this (2012)
	{
		System.out.println("IBanking.printPassBook() - default functionality");
	}

}

class HDFC implements IBanking {

	@Override
	public void pay() {
		System.out.println("HDFC.pay()");
	}

	@Override
	public void settle() {
		System.out.println("HDFC.settle()");
	}

	@Override
	public void cancelTxn() {
		System.out.println("HDFC.cancelTxn()");
	}

}

class PNB implements IBanking {

	@Override
	public void pay() {
		System.out.println("PBG.pay()");

	}

	@Override
	public void settle() {
		System.out.println("PBG.settle()");

	}

	@Override
	public void cancelTxn() {

		System.out.println("PBG.cancelTxn()");
	}

}
// 20+ national bank .....

class RunralBank implements IBanking {

	@Override
	public void pay() {

	}

	@Override
	public void settle() {

	}

	@Override
	public void cancelTxn() {

	}

	@Override
	public void printPassBook() {
		System.out.println("RunralBank.printPassBook()");

	}

}

public class Driver {

	public static void main(String[] args) {

	}

}
