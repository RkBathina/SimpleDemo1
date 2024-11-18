package com.prep.collectionspract;

import java.util.*;

public class ArrayDeQueuePract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayDeque<String> ad = new ArrayDeque<>(); //it follows insertion order
//		Deque<String> ad = new ArrayDeque<>();
//		Queue<String> ad = new ArrayDeque<>();
		
 // Linked last same as list no change
		LinkedList<String> ad = new LinkedList<>();
		
		
		
		
		
		//add elem into queue -offer(bydefault add last),Offerfirst, offerlast, add, addfirst, addlast, addall
		//retrieval - peek, peekfirst, peeklast
		//removal - poll, pollfirst, polllast, remove , removefirst, remove last
		
		ad.add("Banana");
		ad.addFirst("Cherry");
		ad.addLast("Apple");
		ad.offerFirst("kiwi");
		ad.offer("pear");
		ad.offerLast("Mango");
		
		System.out.println(ad);
		System.out.println(ad.peek());
		System.out.println(ad.peekFirst());
		System.out.println(ad.peekLast());
		
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad);
		System.out.println(ad.pollFirst());
		System.out.println(ad);
		System.out.println(ad.pollLast());
		System.out.println(ad);
	}

}
