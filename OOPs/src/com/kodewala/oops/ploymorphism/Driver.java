package com.kodewala.oops.ploymorphism;

class InvoiceMgmt {

}

class GSTInvoice extends InvoiceMgmt {

}

public class Driver {

	public static void main(String[] args) {
		
		GSTInvoice gstInvoice  = new GSTInvoice(); // sample 
		
		// Parent class can refer child class objects.
		InvoiceMgmt invoiceMgmt=(InvoiceMgmt)new GSTInvoice(); // auto up casting 
		
		GSTInvoice gstInvoice2  =  (GSTInvoice) new InvoiceMgmt(); // Down casting
		
	//  Type         ref name  =  Actual Object
	//  int           amount   =  100;
	}

}
