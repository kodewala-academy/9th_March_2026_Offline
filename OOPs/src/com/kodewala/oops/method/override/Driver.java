package com.kodewala.oops.method.override;

class Employee extends Object  // Parent
{
 // functionalities
	public void saySomething()
	{
		System.out.println(" Hello!!!"); // 
	}
}

class Manager extends Employee // Manager is Child now 
{
 // 
	public void saySomething()
	{
		System.out.println(" Hey Bro!");
	}
}

public class Driver {

	public static void main(String[] args) {
		Manager mgr = new Manager();
		mgr.saySomething();
	}

}
