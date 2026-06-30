package com.kodewala.streams8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver
{

	public static void main(String[] args)
	{

		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5); // find the min

		// int sum = list.stream().filter(n-> n%2 !=0).reduce(0, (a,b) -> a+b);

		// System.out.println(sum);

		Optional<Integer> optional = list.stream().max((a, b) -> a - b);
		System.out.println(optional.get());
	
	
	
	
	}

}
