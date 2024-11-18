package com.prep.collectionspract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorPract {

	public static void main(String[] args) {
				// Iterator - Interface
				//Introduced for iterating the  collection objects
				//Legacy classes - v1.0 -Hashtable, stack,vector,Dictionary and propertie + New clasees - v1.2 
				//one direction, read-only with special permisssiopn for removal
		
		Integer arr[] = new Integer[] {5,3,2,9};
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
		System.out.println(al);
		
		Iterator<Integer> il = al.iterator();
		il.hasNext();
		il.next();
		
		while (il.hasNext()) {
			System.out.println(il.next());
			
		}
		il.remove();
		
		//note iteraotr or enum cannot be directly applied on calles using MAP interface example hashmap
		HashMap<Integer, String> val = new HashMap<>();
		val.put(101, "INDIA");
		val.put(102, "USA");
		val.put(103, "AUS");
		
		val.keySet().iterator();
		val.entrySet().iterator();
		val.values().iterator();
	}

}
