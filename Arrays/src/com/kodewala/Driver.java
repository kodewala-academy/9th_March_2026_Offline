package com.kodewala;

class AccountInfo {
	public void getCustomers() {
		// Get the customer's detail whose account balance is -ve

		// created String array which will hold 5 String Objects.
		String customers[] = new String[5]; // static index = 0 to 4
		
		// Add an element
		customers[0]="Rahul";
		customers[1]="Suraj";
		customers[2]="Shubham";
		customers[3]="Nabeel";
		customers[4]="Lokesh";
		
		// Accessing / Reading an element from array
		String element = customers[2];
		
	//	System.out.println(element);
		
		// loop --> processing // Biz logic
		for(int index=0; index <customers.length; index++)
		{
			String currentElement = customers[index];
			
			if(currentElement.startsWith("S"))
			{
				System.out.println(currentElement);
			}
		}
		
	}
}

public class Driver {

	public static void main(String[] args) {
		AccountInfo accountInfo = new AccountInfo();
		accountInfo.getCustomers();
	}

}
