package com.kodewala.streams2;

import java.util.Arrays;
import java.util.List;

public class Driver
{

	public static void main(String[] args)
	{
		// Find the city names starting with A and convert to lower case.

		List<String> input = Arrays.asList("Bangalore", "Chennai", "Hyderabad", "Ahmedabad", "Delhi", "Mysore");

		// This will not do anything(intermediate operations are lazy)
		input.stream().filter(w -> w.startsWith("A")).map(w -> w.toLowerCase());

		long output = input.parallelStream().filter(w -> w.startsWith("A")).map(w -> w.toLowerCase()).count(); // 2 GB --> 1 min

		System.out.println(output);
	}

}
