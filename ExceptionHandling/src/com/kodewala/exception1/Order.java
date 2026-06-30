package com.kodewala.exception1;

public class Order
{

	public void doSomething()
	{
		String name = null; // assume : received from other class

		try
		{
			System.out.println(name.length());
			System.out.println(" After length....");
			int i = 10 / 0;
			String a[] = {};
			String str = a[5];

		} catch (Exception e)// null pointer exception is child of Exception class
		{
			name = "NA";
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++)
		{
			System.out.println("Driver.main()... " + i);
		}
	}

}
