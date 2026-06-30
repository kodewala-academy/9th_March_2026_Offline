package com.kodewala.streams11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Driver
{

	public static void main(String[] args)
	{
		List<String> list1 = Arrays.asList("Bangalore", "Delhi", "Pune", "Chennai", "Hyderabaddd");
		List<String> list2 = Arrays.asList("Delhi", "Noida", "Mysore", "Delhi");

		Optional<String> opt = Stream.concat(list1.stream(), list2.stream())
				.max(Comparator.comparingInt(w -> w.length()));
		System.out.println("Driver.main() : " + opt.get());
	}

}
