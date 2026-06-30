package com.kodewala.inf8;

public class Driver {

	public static void main(String[] args) {

		ICalc calc = (i) ->  i*i;

		int square = calc.square(12);
		
		System.out.println(square);
	}

}
