package com.prep.collectionspract;

import java.util.ArrayList;
import java.util.Arrays;

public class ListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ListIterator - Interface
		//Introduced for iterating the only LIST type of  collection objects
		//Legacy classes - v1.0 -Arraylist,Linkedlist, stack,vector + New clasees - v1.2 
		//BI direction, Read and write
		
		Integer arr[] = new Integer[] {5,3,2,9};
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(arr));
		
		java.util.ListIterator<Integer> li= al.listIterator();
		
//		li.hasNext();
//		li.next();
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		li.add(56);
		System.out.println();
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		li.remove();
		
		System.out.println(al);

	}

}
