package com.kodewala.set;

import java.util.TreeSet;

class Employee10 implements Comparable<Employee10>
{
	int salary;
	String name;

	public Employee10(int _salary, String _name)
	{
		super();
		this.salary = _salary;
		this.name = _name;
	}

	@Override
	public int compareTo(Employee10 e2) // -ve OR Zero OR +ve
	{
		return (e2.name.compareTo(this.name)); // zero
	}

}

public class Driver7
{

	public static void main(String[] args)
	{
		Employee10 e1 = new Employee10(120000, "rohit");
		Employee10 e2 = new Employee10(134000, "rohit");
		Employee10 e3 = new Employee10(130000, "ajhar");
		Employee10 e4 = new Employee10(40000, "someone");
		// are these comparable ? No

		TreeSet<Employee10> ts = new TreeSet<Employee10>(); // Will do sorting based on salary

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);

		System.out.println(ts);
		for (Employee10 e : ts)
		{
			System.out.println(e.name + " and " + e.salary);
		}
	}

}
