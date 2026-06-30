package com.kodewala.inf5;

public class Person implements Cloneable {

	String name;

	Person(String _name) {
		this.name = _name;
	}

	@Override
	public Person clone() throws CloneNotSupportedException {
		return (Person) super.clone(); // Object class clone
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		Person p = new Person("Kodewala");

		
		  Person p1 = p.clone();
		  
		  System.out.println(" p " + p.name); System.out.println(" p1 " + p1.name);
		 
		
		if (p instanceof Cloneable) { // True if person's object is type of Clonable --> person class should implement clonable interface 
			System.out.println(" p is type of Clonable");
		}
		else
		{
			System.out.println(" p is not a type of Clonable. You can not clone the object of Person class");
		}

	}

}
