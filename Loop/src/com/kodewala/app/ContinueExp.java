package com.kodewala.app;

public class ContinueExp {

	public static void main(String[] args) {

		String[] products = { "Apple iPhone 16", null, "OnePlus 13 Pro", "Google Pixel 9", null, null, "Dell XPS 15 2026",
				"HP Spectre x360 2025", "Lenovo ThinkPad X1 Carbon Gen 13", "Asus ROG Zephyrus G16", "Sony WH-1000XM6",
				"Apple Watch Series 10", "Samsung Galaxy Watch 7", "iPad Pro M4 12.9", null, "Nintendo Switch 2",
				"PlayStation 6", "Xbox Series Z", null, "GoPro Hero 13" };

		for(int index=0; index < products.length; index++)
		{
			String currentProduct=products[index];
			
			if(currentProduct == null || currentProduct.startsWith("Apple") )
			{
				continue; // skip the current iteration 
			}
			
			// biz logic 
			System.out.println(currentProduct.toUpperCase()); // 100 lines of code 
		}
		
		
	}

}
