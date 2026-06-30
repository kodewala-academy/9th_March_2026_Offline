package com.kodewala.streams10;

import java.util.Optional;

public class Driver
{

	public static void main(String[] args)
	{
		// find the first non repeating char
		String word = "swiss";

		Optional<Character> out = word.chars().mapToObj(c -> (char) c)
				.filter(ch -> word.indexOf(ch) == word.lastIndexOf(ch)).findFirst();

		System.out.println(out.get());
	}

}
