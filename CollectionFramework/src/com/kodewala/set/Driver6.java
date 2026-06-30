package com.kodewala.set;

import java.util.TreeSet;

public class Driver6
{

	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>(); // Not on hashing based (No role of equals and hashcode method)

		ts.add("BLR");
		ts.add("AHM");
		ts.add("DEL");
		ts.add("CH");
		ts.add("CHENNAI");
		ts.add("HYD");
		ts.add("MYSORE");
		ts.add("MYSORE");
		ts.add("KOL");
		ts.add("MUMBAI");
		ts.add(null);

		System.out.println(ts);

	}

}
