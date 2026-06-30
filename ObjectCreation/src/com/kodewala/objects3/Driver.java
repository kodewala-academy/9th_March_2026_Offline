package com.kodewala.objects3;

class Payment {

	int amount;
	String upiID;
	String note;
	String bank;
	String mobileNumber;
	String name;

	public Payment(int _amount, String _upiID) {

		this.amount = _amount;
		this.upiID = _upiID;
	}

	public Payment(int _amount, String _upiID, String _note) {
		this.amount = _amount;
		this.upiID = _upiID;
		this.note = _note;
	}
	

	public Payment(int _amount, String _mobileNumber, String _name, String _bank) {
		this.amount = _amount;
		this.mobileNumber = _mobileNumber;
		this.name = _name;
		this.bank = _bank;
	}

}

public class Driver {

	public static void main(String[] args) {
		
		Payment payment1 = new Payment(200, "abcd@oksbi"); // 
		
		Payment payment2 = new Payment(1200, "xyz@okicici", "food bill");
		
		Payment payment3 = new Payment(1200, "9999999999", "kodewala", "IDFC");
		
		System.out.println();
	}

}
