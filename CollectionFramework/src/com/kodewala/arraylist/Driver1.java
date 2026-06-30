package com.kodewala.arraylist;

import java.util.LinkedList;

public class Driver1
{

	public static void main(String[] args)
	{

		LinkedList<String> list = new LinkedList<String>();
		list.add("Bangalore");
		list.add("Chennai");
		list.add("Hyderabad");
		list.add("Mumbai");
		list.add("Delhi");
		
		System.out.println(list);
		
		list.add(2,"Jaipur");
		System.out.println(list);
	}

}
