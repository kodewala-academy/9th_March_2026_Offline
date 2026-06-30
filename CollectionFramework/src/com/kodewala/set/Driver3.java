package com.kodewala.set;

import java.util.HashSet;
import java.util.Set;

class Employeee
{
	String name;

	public Employeee(String name)
	{
		super();
		this.name = name;
	}

	public boolean equals(Object obj)
	{
		Employeee e = (Employeee) obj;
		return this.name.equals(e.name);
	}

	public int hashCode()
	{
		return this.name.hashCode();
	}

}

public class Driver3
{

	public static void main(String[] args)
	{
		Set<String> cities = new HashSet<String>(); // default cap : 16 

		cities.add("BLR");
		cities.add("CHE");
		cities.add("BLR");

		System.out.println(cities.size()); // 2

		Set<Employeee> emps = new HashSet<Employeee>();
		Employeee e1 = new Employeee("ritesh");
		Employeee e2 = new Employeee("suraj");
		Employeee e3 = new Employeee("jyoti");
		Employeee e4 = new Employeee("ritesh");

		emps.add(e1);
		emps.add(e2);
		emps.add(e3);
		emps.add(e4);
		System.out.println(emps.size()); // 4
		System.out.println(e1.hashCode() + " " + e4.hashCode() + " and  e1 and e4 are same ? " + e1.equals(e4));
	}

}
