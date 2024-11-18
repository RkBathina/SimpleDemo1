package com.prep.collectionspract;


import java.util.*;
import java.util.Map.Entry;

public class MapPract {

	public static void main(String[] args) {
		
		//creation of map - we can use any class like,hashtable,hashmap,linkedhashmap,treemap and all of them have same functions
		//Map<Integer, String> m = new Hashtable<>();
		//Map<Integer, String> m = new HashMap<>();
		Map<Integer, String> m = new LinkedHashMap<>();
		//Map<Integer, String> m = new TreeMap<>();
		
		
		//Adiition of elem into map
		m.put(900050, "Hyderabad");
		m.put(603103, "Chennai");
		m.put(760102, "Delhi");
		
		//Retrieval of key from map
		Set<Integer> keys =  m.keySet();
		for (Integer key : keys) {
			System.out.println(key);
		}
		
		System.out.println();
		//Retrieval of values from map
		Collection<String> values =  m.values();
		for (String value : values) {
			System.out.println(value);
		}
		
		System.out.println();
		//Retrieval of value from map based on key
		System.out.println(m.get(603103));
		
		System.out.println();
		//Retrieval of values from map based on all the keys
		//we already have /Retrieval of key from map we acn use that a
		for (Integer key : keys) {
			System.out.println(key +" -" +m.get(key));
		}
		
		
		//Deletion of elem form map
		System.out.println(m);
		//m.remove(603103);
		//m.remove(603103, "Chennai");
		
		System.out.println(m);
		
		//verification of keys and values
		System.out.println(m.containsKey(603103));
		System.out.println(m.containsKey(500051));
		
		System.out.println(m.containsValue("Chennai"));
		System.out.println(m.containsValue("fhhfh"));
		
		//updation of elements
		m.put(603103, "Banglore");
		System.out.println(m);
		
		//insert if key is not present
		m.putIfAbsent(603103, "Banglore");
		System.out.println(m);
		
		//update
		m.replace(603103, "vizag");
		System.out.println(m);
		
		System.out.println(m.size());
		
		//to delete entire map
//		m.clear();
	//	System.out.println(m);
		
		
		//Entry set for each data retieve key value pairs
		Set<Entry<Integer, String>> entries = m.entrySet(); //used for class object return example employee data id,name,slary
		for (Entry<Integer, String> entry : entries) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key+"--"+value);
		}
	}

}
