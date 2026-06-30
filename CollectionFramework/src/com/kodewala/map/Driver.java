package com.kodewala.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Driver
{

	public static void main(String[] args)
	{
		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("samsung");

	//	System.out.println("Driver.main() " + set);

		Iterator<String> itr = set.iterator();

		while (itr.hasNext())
		{
			String element = itr.next();
		//	System.out.println("elements are " + element);

		}

		// Task - Store city(value) and state(key)

		Map<String, String> stateAndCity = new TreeMap<String, String>();

		stateAndCity.put("Karnataka", "Bangalore");
		stateAndCity.put("Maharastra", "Mumbai");
		stateAndCity.put("Tamilnadu", "Chennai");
		stateAndCity.put("Telengana", "Hyderabad"); // 5th bucket --> O(1) --> "Telengana".hashCode() & 15 --> 5th index
		stateAndCity.put("Gujrat", "Ahmedabad");
		stateAndCity.put("Gujrat", "Ahmedabad");
	//	stateAndCity.put(null, "Bengaluru"); // No Duplicate Keys

	//	System.out.println(stateAndCity.get("Telengana")); // O(1)

		// How does hashmap works internally OR How put method works // How does get
		// works

	//	System.out.println(stateAndCity);
		
		// Convert the map to set of entries
		Set<Entry<String, String>> entrySet =  stateAndCity.entrySet();
		
		// convert the entry set to iterator 
		Iterator<Entry<String, String>>  itr1 = entrySet.iterator();
		
		// iterate it
		
		while(itr1.hasNext())
		{
			Entry<String, String> entry = itr1.next();
			System.out.println(entry.getKey() + " and "+entry.getValue());
		}

	}

}
