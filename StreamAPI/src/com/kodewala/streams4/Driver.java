package com.kodewala.streams4;

import java.util.Arrays;
import java.util.List;

public class Driver
{
	public static void main(String[] args)
	{
		List<Integer> input = Arrays.asList(10,4, 5, 6, 6, 7, 8);

		// sorting
		input.stream().sorted((a,b) -> a-b).forEach(number -> System.out.println(number));
	}

}
