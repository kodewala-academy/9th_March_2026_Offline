package com.kodewala.str2;

class Account
{
	
}

public class Driver 
{

	public static void main(String[] args)
	{
		String s1 = "Hello " + "World"; // SCP

		String s2 = "Kodewala";
		String s3 = " Academy";

		String s4 = s2 + s3; // s4 ? --> Heap  --> "Kodewala Academy"
		
		String s5 = s4.intern(); // copy object(s4) from heap to scp.
		 
		 System.out.println(s4 == s5); // true(scp)
		
	}

}
