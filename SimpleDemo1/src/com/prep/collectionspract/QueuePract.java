package com.prep.collectionspract;

import java.util.*;

public class QueuePract {

	public static void main(String[] args) {
		// Priority queue
		//PriorityQueue<Integer> pq = new PriorityQueue<>();
		Queue<Integer> pq = new PriorityQueue<>();
		
		//add elem into queue -offer, add
		//retrieval - peek
		//removal - poll, remove
		
		
		pq.add(8); 
		pq.offer(2);
		pq.offer(5);
		pq.add(7);
		pq.add(1);
		System.out.println(pq);
		
		//retrieve
		System.out.println(pq.peek());//give head values
		System.out.println(pq.poll());//removes head value
		//System.out.println(pq.remove()); //if queue is empty poll gives "null" value wheras remove throws exception
		System.out.println(pq);
		
		System.out.println(pq.contains(8));
		
		//it's better to use while loop indtead for foreach loop in priority queue becuase it retieves data based on priority
		for (Integer integer : pq) {
			System.out.println(integer);
		}
		
		System.out.println();
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		//remove all elem
		// pq.clear();
		
		//by default lowest integer high priority but if we use comparator huigh num high prior
		PriorityQueue<Integer> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
		pq1.add(8); 
		pq1.offer(2);
		pq1.offer(5);
		pq1.add(7);
		pq1.add(1);
		System.out.println(pq1);
		while (!pq1.isEmpty()) {
			System.out.println(pq1.poll());
		}
		System.out.println(pq1);
		
		
		//queue with string
		Queue<String> ad = new PriorityQueue<>();
		ad.add("Banana");
		ad.add("Cherry");
		ad.add("Apple");
		ad.offer("kiwi");
		ad.offer("pear");
		ad.offer("Mango");
		
		System.out.println(ad);
		System.out.println(ad.peek());
		//System.out.println(pq.poll());
		while (!ad.isEmpty()) {
			System.out.println(ad.poll());
		}
	}

}
