package com.prep.collectionspract;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListPrac {

	public static void main(String[] args) {
		Integer arr[] = new Integer[] {1,2,3,4,5};
		ArrayList<Integer> al1 = new ArrayList<>(Arrays.asList(arr));
		
 		System.out.println(al1);
// 		al1.add(6);
// 		al1.add(0, 23);
// 		al1.add(6);
// 		al1.add(0, 23);
// 		al1.add(6);
// 		al1.add(0, 23);
// 		al1.add(6);
// 		al1.add(0, 23);
// 		al1.add(6);
// 		al1.add(0, 23);
// 		al1.add(6);
// 		
		System.out.println(al1.size());
		System.out.println(al1);
		System.out.println(al1.get(4));
		//System.out.println(al1.remove(4));
		System.out.println(al1.contains(3));
		System.out.println(al1.set(3, 47));
		System.out.println(al1);
		Collections.synchronizedList(al1);//synchronization

	}
	

}
