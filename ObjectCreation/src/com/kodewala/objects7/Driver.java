package com.kodewala.objects7;

class Employee {
	static int counter = 0;
	String name;
	String empId;

	{
		counter = counter + 1;
	}

	
	public Employee(String _name, String _company) {
		// super or this
		// iib
		this.name = _name;
		this.empId = _company + "_" + counter;
	}

}

public class Driver {

	public static void main(String[] args) {
		Employee e = new Employee("Rahul", "Infosys");
		System.out.println(e.name + " and " + e.empId);
		
		Employee e2 = new Employee("Lokesh", "Infosys");
		System.out.println(e2.name + " and " + e2.empId);
	}
}
