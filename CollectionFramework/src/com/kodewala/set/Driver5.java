package com.kodewala.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Driver5
{

	public static void main(String[] args)
	{
		LinkedHashSet<String> set = new LinkedHashSet<String>();

		// Adding the elements

		set.add("BLR"); // boolean
		set.add("chennai");
		set.add("delhi");
		set.add("Ahmedabad");
		set.add("Hyderadbad");
		set.add("Amritsar");
		set.add(null);
		set.add(null);
		
		
		System.out.println(set); // ordered ?

		// Task - Get the city name(s) which starts with 'A'

		// How do you read / iterate the collection / set

		for (String element : set) //
		{
			if (element !=null && element.startsWith("A")) // processing logic
			{
			//	System.out.println(element);
			}
		}

		// Using iterator

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) // check if next element is there or not 
		{
			String element = itr.next(); // read the element
			if (element !=null && element.startsWith("A")) // processing logic
			{
			//	System.out.println(" Cities start with A are : " + element);
			}
		}

	}

}
