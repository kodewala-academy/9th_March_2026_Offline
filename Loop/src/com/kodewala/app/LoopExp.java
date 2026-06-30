package com.kodewala.app;

public class LoopExp {

	public static void main(String[] args) {

		System.out.println(" Main - STARTED");

		LoopExp exp = new LoopExp();
		
		exp.checkCity();
		
		System.out.println(" Main - ENDED");
	}

	public void checkCity() {
		String cities[] = { null, "Chennai", "Bangalore", "Delhi", "Ahmedabad", "Jaipur", "Mysore" };

		// Task - check if city(Bangalore) exists in the given array or not.

		for (int index = 0; index < cities.length; index++) {

			String currentCity = cities[index];
			
			if(currentCity ==null)
			{
				System.out.println(" null city found... exiting!! from method");
				return;
			}
			
			if (currentCity.equalsIgnoreCase("Bangalore")) {
				System.out.println(" Bangalore is part of the city list");
				break;
			}

		}
	}

}
