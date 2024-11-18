package com.prep.collectionspract;

import java.util.*;

public class SetPractise {

	public static void main(String[] args) {
		//HASH SET INTERNALLY USES HASHMAP AND HASHMAP INTERNALLY USES ARRAY OF NODES(KEY, VALUE)
		//HashSet<Integer> hs = new HashSet<>();
		//HashSet<Integer> hs = new HashSet<>();
		
		//Linked hashset internal repre --> linkedhashmap --> link of nodes(key, value)
		//LinkedHashSet<Integer> hs = new LinkedHashSet<>();
		
		//Tree Set --> TreeMap --> Binary tree -->Always gives sorted order
		TreeSet<Integer> hs = new TreeSet<>();
		
		//key- is the data which we are adding
		//new Object(); //dummy object- 
		//Add data
		hs.add(10);
		hs.add(2);
		hs.add(65);
		hs.add(85);
		hs.add(5);
		hs.add(10);// we cannot add duplicate values
		hs.add(5);
		
		System.out.println(hs);
		
		System.out.println(hs.contains(85));
		//remove data
		System.out.println(hs.remove(85));
		System.out.println(hs.remove(1)); //it is not index it removes data
		
		//retrieve data
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		
		System.out.println(hs); 
		System.out.println(hs.isEmpty());
		
		//Additional features(operations) given by treeset
		System.out.println(hs.first());
		System.out.println(hs.last());
//		System.out.println(hs.pollFirst());//removes first elem
//		System.out.println(hs.pollLast());//removes last elem
		System.out.println(hs.subSet(5, 65));//As elems are present it takes them 
		System.out.println(hs.subSet(4, 65));//As elem not present it takes as range
		System.out.println(hs.descendingSet());
		System.out.println(hs); 
	}

}
