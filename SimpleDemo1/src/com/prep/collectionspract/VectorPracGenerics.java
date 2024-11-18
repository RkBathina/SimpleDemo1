package com.prep.collectionspract;

import java.util.Arrays;
import java.util.Vector;

public class VectorPracGenerics {
	public static void main(String[] args) {
		Object arr[] = new Object[] {1,2,3,4,5};
		Vector<Integer> v = new Vector<Integer>(); //<> this is generics
		v.add(12);
		v.add(null);
		v.add(12);
//		v.add(34.5);  //now it doesnot allow us tto add other than integer data type
//		v.add("ram");
//		int sum=0;
//		for(int i =0 ;i<v.size();i++) {
//			sum += (int)v.get(i);
//		}
//		System.out.println(sum);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.capacity());
		
  }

}
