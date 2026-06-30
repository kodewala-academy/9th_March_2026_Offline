package com.kodewala.oops.ploymorphism.real.exp;

class PurchaseMgmt {

}

class Purchase extends PurchaseMgmt {

}

public class Driver3 {

	public static void main(String[] args) {
		PurchaseMgmt pm = new Purchase();

		Purchase p = (Purchase)pm;
		System.out.println("Driver3.main()"); // syst + ctl + space bar 
	}

}
