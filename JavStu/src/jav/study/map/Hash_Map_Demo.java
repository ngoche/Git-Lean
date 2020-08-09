package jav.study.map;

import java.lang.reflect.Array;
//Java code to illustrate the entrySet() method 
import java.util.*;

public class Hash_Map_Demo {
	public static void main(String[] args) {

		// Creating an empty HashMap
		HashMap<String, Integer> hash_map = new HashMap<String, Integer>();

		// Mapping int values to string keys
		hash_map.put("Geeks", 10);
		hash_map.put("4", 15);
		hash_map.put("Geeks", 20);
		hash_map.put("Welcomes", 25);
		hash_map.put("You", 30);

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Using entrySet() to get the set view
		System.out.println("The set is: " + hash_map.entrySet());
		List<String> listString = new ArrayList<String>();
		listString.add("henv");
		listString.add("henv2");
		System.out.println("List of string: " + listString);

	}

}
