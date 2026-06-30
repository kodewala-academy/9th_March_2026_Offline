package com.kodewala.set1;

import java.util.Comparator;

public class FirstNameComperator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2)
	{

		return o1.firstName.compareTo(o2.firstName);
		
	}

}
