package com.prep.collectionspract;

import java.util.*;

public class LinkedListPrac {
	//here we only focused on list interface point of view for linked list as it can have queue interface
	public static void main(String[] args) {
		ArrayList<String> AL = new ArrayList<>();
		AL.add("s1");
		AL.add("S2");
		
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Y1");
		ll.add("Y2");
		ll.add("Y3");
		ll.add("Y3");
		ll.add(null);
		ll.add(1, "YY ");
		ll.add(null);
		//ll.addAll(AL);
		//ll.addAll(0, AL);
		System.out.println(ll); 
		//ll.remove(1);
		//ll.clear();
		//ll.removeAll(AL);
		System.out.println(ll.get(3));
		System.out.println(ll.contains("Y1"));
		// ll.set(4, "Kittu");
		Collections.synchronizedList(ll);
		System.out.println(ll); 
		
		
		

	}

}
