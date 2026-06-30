package com.kodewala.streams2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver2
{

	public static void main(String[] args)
	{
		// Find the city names which starts with B and city name length is more then 6

		List<String> input = Arrays.asList("Bangalore", "Chennai", "Hyderabad", "Ahmedabad", "Delhi", "Mysore");

		List<String> output = input.stream().filter(w -> w.startsWith("B") && w.length() > 5)
				.collect(Collectors.toList());

		System.out.println(output);
	}

}
