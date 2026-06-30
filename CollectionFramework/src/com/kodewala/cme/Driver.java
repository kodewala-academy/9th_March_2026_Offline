package com.kodewala.cme;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Driver
{

	public static void main(String[] args)
	{
		List<String> products = new CopyOnWriteArrayList<String>(); // Fail Safe ()

		products.add("Apple");
		products.add("Samsung");
		products.add("LG");
		products.add("something");

		Iterator<String> itr = products.iterator();

		while (itr.hasNext())
		{
			String element = (String) itr.next();

			products.remove("Samsung");
			System.out.println(" removing the junk element");

		}

		System.out.println(products);
	}

}
