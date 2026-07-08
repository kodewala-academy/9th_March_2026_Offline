package com.kodewala.junit.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.kodewala.junit.Calculator;

// developer will write all the test cases to check the functionality

public class CalculatorTests

{
	static Calculator calculator;

	@BeforeAll
	public static void setup()
	{
		calculator = new Calculator();
		System.out.println("CalculatorTests.setup().........................................");
	}

	@AfterAll
	public static void cleanup()
	{
		calculator = null;
		System.out.println("CalculatorTests.cleanup().........................................");
	}

	@BeforeEach
	public void before()
	{
		System.out.println("CalculatorTests.before().......................................................");
	}

	@Test
	public void testaddTwoNumber()
	{
		System.out.println("CalculatorTests.testaddTwoNumber()");

		int expected = 23; // setting the expectation

		int actual = calculator.doCalculation(10, 13); // based on input what method is returning

		assertEquals(expected, actual); // compare the expected with actual

	}

	@Test
	public void testaddTwoNumberWithZero()
	{

		int expected = 223; // setting the expectation

		int actual = calculator.doCalculation(0, 13); // based on input what method is returning

		assertEquals(expected, actual); // compare the expected with actual

	}

	@Test
	public void testaddTwoNumberWithBothZero()
	{

		int expected = 0; // setting the expectation

		int actual = calculator.doCalculation(0, 0); // based on input what method is returning

		assertEquals(expected, actual); // compare the expected with actual

	}

	@Test
	public void testaddTwoNumberWithNegative()
	{
		Calculator calculator = new Calculator();

		int expected = 2; // setting the expectation

		int actual = calculator.doCalculation(-23, 25); // based on input what method is returning

		assertEquals(expected, actual); // compare the expected with actual

	}

	@Test
	public void testaddTwoNumberBothNegative()
	{

		int expected = -25; // setting the expectation

		int actual = calculator.doCalculation(-23, -2); // based on input what method is returning

		assertEquals(expected, actual); // compare the expected with actual

	}
}
