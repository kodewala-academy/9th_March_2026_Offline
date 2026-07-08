package com.kodewala.discount.junit;

public class DiscountService
{

	public static double calculateFinalAmount(double amount, CustomerType customerType, boolean isFestivalSale,
			boolean isFirstOrder, int loyaltyPoints)
	{

		if (amount <= 0)
		{
			throw new IllegalArgumentException("Invalid order amount");
		}

		double discount = 0;

		switch (customerType)
		{

		case REGULAR:
			discount = 10;
			break;

		case PREMIUM:
			discount = 20;
			break;
		}

// Festival Offer
		if (isFestivalSale)
		{
			discount += 5;
		}

// First Order Offer
		if (isFirstOrder)
		{
			discount += 5;
		}

// Loyalty Bonus
		if (loyaltyPoints >= 1000)
		{
			discount += 3;
		}

// Maximum discount allowed
		if (discount > 30)
		{
			discount = 30;
		}

		return amount - (amount * discount / 100);
	}

}