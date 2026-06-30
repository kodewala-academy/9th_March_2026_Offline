package com.kodewala.exception1;

public class Driver1
{

	public static void main(String[] args)
	{
		Driver1 driver1 = new Driver1();
		driver1.m1();

	}

	public void m1()
	{
		System.out.println("Driver1.m1()");
		m2();
	}

	public void m2()
	{
		System.out.println("Driver1.m2()");
		m1();
	}

}
