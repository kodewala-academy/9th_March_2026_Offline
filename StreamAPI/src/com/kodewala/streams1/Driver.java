package com.kodewala.streams1;

import java.util.ArrayList;
import java.util.Iterator;

public class Driver
{

	public static void main(String[] args)
	{
		// 
		ArrayList<String> products = new ArrayList<String>();
		
		// Storing the products
		products.add("apple");
		products.add("samsung");
		products.add("lg");
		products.add("sony");

		// Now we need to process the products --> find the products which are starting with 's'
		
		Iterator<String> itr =  products.iterator(); // 10 lines of code to process...
		
		while (itr.hasNext())
		{
			String product = (String) itr.next();
			// logic
			if(product.startsWith("s"))
			{
				System.out.println("products " +product);
			}
			
		}
	}

}
