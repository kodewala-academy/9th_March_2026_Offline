package com.kodewala.set;

class Person
{
	private String name;

	public Person(String name)
	{
		super();
		this.name = name;
	}

	@Override
	public int hashCode()
	{
		return 431242343;
	}

}

public class Driver1
{
	public static void main(String[] args)
	{

		// Contract#1 : If two objects are equal then hash code must be same.
		String s1 = "Kodewala";
		String s2 = "Kodewala";

		System.out.println(s1.hashCode() + " and " + s2.hashCode());

		// Contract#2 : If two objects return same hash code, object may or may not be
		// equal.
		Person p1 = new Person("Ajay");
		Person p2 = new Person("Vijya");
		
		System.out.println(p1.hashCode() +" and "+p2.hashCode() +" is p1 and p2 equal? "+p1.equals(p2));

	}
}
