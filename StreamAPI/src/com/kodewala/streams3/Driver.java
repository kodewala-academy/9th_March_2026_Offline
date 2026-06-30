package com.kodewala.streams3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver
{
	public static void main(String[] args)
	{
		List<Integer> input = Arrays.asList(4, 4, 5, 6, 6, 7, 8, 9, 5, 4, 3, 21, 2, 3445, 56, 7, 8);

		// remove the duplicate.

		List<Integer> output = input.stream().distinct().collect(Collectors.toList());

		System.out.println(output);
	}
}
