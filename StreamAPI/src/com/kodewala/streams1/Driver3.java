package com.kodewala.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Driver3
{

	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(2,4,5,63,2,24,6,778,4,4356,7,6,5);
		
		// 
		
		List<Integer> output  = list.stream().map(n -> n*10).filter(n -> n>100).collect(Collectors.toList());
		
		System.out.println(output);

	}

}
