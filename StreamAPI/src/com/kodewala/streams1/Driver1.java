package com.kodewala.streams1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Driver1
{

	public static void main(String[] args)
	{

		List<String> brand = Arrays.asList("samsung", "lg", "sony", "bosch", "apple", "nokia", "micromax", "realme"); // Collection

		System.out.println("input : " + brand);
		// Process the collection - Task --> convert all the brand to upper case

		// 1 - convert the collection(list) to stream object
		Stream<String> stream = brand.stream();

		// 2 - Apply processing logic (intermediate and terminal)

		Stream<String> upperCaseStream = stream.map(word -> word.toUpperCase());

		// 3 - Collect the result / terminate the stream

		List<String> processedBrands = upperCaseStream.collect(Collectors.toList());
		
		System.out.println("processed : " + processedBrands);
	}

}
