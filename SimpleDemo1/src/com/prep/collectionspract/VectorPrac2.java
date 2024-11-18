package com.prep.collectionspract;

import java.util.Arrays;
import java.util.Vector;

public class VectorPrac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v1 = new Vector();
		v1.add("kittu");
		v1.add("Bathin");
		v1.add(0,"Bannu");
		
		Vector v2 = new Vector();
		v2.add("ramesh");
		v2.add("suresh");
		v2.add("kittu");
		System.out.println(v1);
		
		
		Vector v3 = new Vector(20);
		v3.add("suresh");
		v3.add("ramesh");
		System.out.println(v3.size());
		System.out.println(v3.capacity());
		
		Object arr1[] = new Object[] {1,2,3,4,5};
		Vector v4 = new Vector(Arrays.asList(arr1));
		System.out.println(v4);
		System.out.println(v4.size());
		System.out.println(v4.capacity());
		
		
		
//		for(int i=0;i<v2.size();i++) {  // if we use for loop and add perform and memmory waste instead we have addall method
//			v1.add(v2.get(i));
//		}
		
		//v1.addAll(v2);
		v1.addAll(0, v2);
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println(v1.get(2));
		//System.out.println(v1.remove(0));
		//System.out.println(v1.remove("kittu"));
		//v1.removeAll(v2);
		//v1.clear();
		System.out.println(v1.contains("Bannu"));
		System.out.println(v1.containsAll(v2));
		System.out.println(v1.containsAll(v3));
		//System.out.println(v1.set(2, "bathina"));
		System.out.println(v1.indexOf("kittu"));
		System.out.println(v1.lastIndexOf("kittu"));
		System.out.println(v1.firstElement());
		System.out.println(v1.lastElement());
		//array conversion of vecot to array
		Object[] arr = v1.toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println(v1);
	}

}
