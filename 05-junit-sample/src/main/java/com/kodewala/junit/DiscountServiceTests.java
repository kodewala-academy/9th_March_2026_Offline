package com.kodewala.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.kodewala.discount.junit.CustomerType;
import com.kodewala.discount.junit.DiscountService;

public class DiscountServiceTests
{
	static DiscountService discountService;
	
	@BeforeAll
	public static void beforeAll()
	{
		 discountService = new DiscountService();
	}
	
	
	@Test
	public void testCalculateFinalAmountRegular()
	{
		double expected = 1600;
		double actual = discountService.calculateFinalAmount(2000, CustomerType.REGULAR, true, true, 100);
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void testCalculateFinalAmountPremium()
	{
		double expected = 1400;
		double actual = discountService.calculateFinalAmount(2000, CustomerType.PREMIUM,true, true, 100);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testCalculateFinalAmountPremiumRPAbove1000()
	{
		double expected = 1400;
		double actual = discountService.calculateFinalAmount(2000, CustomerType.PREMIUM,true, true, 1200);
		assertEquals(expected, actual);
	}
	
}
