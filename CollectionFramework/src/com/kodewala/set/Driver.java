package com.kodewala.set;

import java.util.HashSet;
import java.util.Set;

class Employee
{
	String name;
	
	
	
	public Employee(String name)
	{
		super();
		this.name = name;
	}



	@Override
	public int hashCode()
	{
		return 12344321;
	}
}

public class Driver
{

	public static void main(String[] args)
	{
		Set<Employee> emps = new HashSet<Employee>(16);

		Employee employee1 = new Employee("Kodewala");
		Employee employee2 = new Employee("Academy");

		System.out.println(employee1.hashCode() + " and " + employee2.hashCode());

		emps.add(employee1);
		emps.add(employee2);

		int hash = employee1.hashCode();
		hash = hash ^ (hash >>> 16);
		int bucketIndex = (16 - 1) & hash;
		System.out.println(" employee1 stored at " + bucketIndex);

		System.out.println(emps.size());

	}

}
