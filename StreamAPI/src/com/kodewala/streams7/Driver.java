package com.kodewala.streams7;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver
{

	public static void main(String[] args)
	{
		List<Integer> input = Arrays.asList(900, 15000, 12000, 13000, 11000, 10000, 13000);
		// find the 2nd highest salary
		// remove duplicate --> sort --> skip --> find first

		Optional<Integer> optional = input.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst();
		System.out.println(optional.get());
	}

}
