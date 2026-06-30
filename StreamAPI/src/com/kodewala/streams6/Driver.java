package com.kodewala.streams6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Driver
{

	public static void main(String[] args)
	{
		List<Integer> input = Arrays.asList(10,4, 5, 6, 6, 7, 8);
        
		// print first element from given list of int
		Optional<Integer> optional = input.stream().findFirst();
		System.out.println(optional.get());
		
	}

}
