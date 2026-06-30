package com.kodewala.collection.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsUtil
{

	public static void main(String[] args)
	{
		Map<String, String> products = new HashMap<String, String>(); // Thread safe 

		products.put("Apple","iphonr16");
		products.put("Samsung","s20");

		
		Map<String, String> newProducts =  Collections.synchronizedMap(products);
		
	    // newProducts thread safe( 500 buckets) --> 5th bucket is being updated --> 499 
		
		Map<String, String> concurrentProducts = new ConcurrentHashMap<String, String>(1000); // 999
		
		
		concurrentProducts.put("BLR", "test"); // 10th index

	}

}
