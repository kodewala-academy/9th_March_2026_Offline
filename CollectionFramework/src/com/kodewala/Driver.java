package com.kodewala;

import java.util.ArrayList;

public class Driver
{

	public static void main(String[] args)
	{
		// Task --> Create an array list and store the elements

		ArrayList<String> studentList = new ArrayList<String>(); // Cap : 10,  Create an object of ArrayList and store String object
		
		studentList.add("chaitanya"); // Added String object to the list
		studentList.add("lokesh");
		studentList.add("rohit");	
		studentList.add("lokesh");
		studentList.add("Nadeem"); // Total 4 string objects have been added to the list.
		studentList.add("chaitanya"); // Added String object to the list
		studentList.add("lokesh");
		studentList.add("rohit");	
		studentList.add("lokesh");
		studentList.add("Rahul");
		studentList.add("Nadeem");
		
	//	System.out.println(studentList.get(3));
		// Index based --> 
		// apply some operation.. find the names which start with 
		
		for(int i =0; i<studentList.size(); i++)
		{
			String currentElement = studentList.get(i);
			if(currentElement.toUpperCase().startsWith("R"))
			{
				System.out.println(currentElement);
			}
		}
		
		
	}

}
