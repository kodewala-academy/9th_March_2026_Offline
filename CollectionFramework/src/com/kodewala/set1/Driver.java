package com.kodewala.set1;

import java.util.TreeSet;

public class Driver
{

	public static void main(String[] args)
	{

		Employee e1 = new Employee("rohit", "bhishikar");
		Employee e2 = new Employee("shubham", "mahajan");
		Employee e3 = new Employee("shahil", "ansari");

		TreeSet<Employee> ts = new TreeSet<Employee>(new FirstNameComperator());

		ts.add(e1);
		ts.add(e2);
		ts.add(e3);

		for (Employee e : ts)
		{
			System.out.println(e.firstName + " and " + e.lastName);
		}
	}

}
