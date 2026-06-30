package com.kodewala.streams9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Driver
{
	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Bangalore", "Pune", "Chennai", "Hyderabad", "Delhi", "Noida", "Mysore");

		// group the cities by the length whose length is more than 6.

		Map<Boolean, List<String>> output = list.stream().collect(Collectors.partitioningBy(w -> w.length()>6));

		System.out.println(output);

	}
}
