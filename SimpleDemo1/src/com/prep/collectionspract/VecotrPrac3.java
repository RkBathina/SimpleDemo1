package com.prep.collectionspract;

import java.util.*;

public class VecotrPrac3 {

	public static void main(String[] args) {
		// Drawback of vector as we are unable to sum here(because there is no restriction we caN ADD INT OR STRING) we have new concept generics
		//vector java 1.0
		//collections 1.2
		//gENERICS 1.5
		//in generics we can only add non primitive data types 
		Object arr[] = new Object[] {1,2,3,4,5};
		Vector v = new Vector(Arrays.asList(arr));
		v.add("kittu");
		int sum=0;
		for(int i =0 ;i<v.size();i++) {
			sum += (int)v.get(i);
		}
		System.out.println(sum);
		
	}

}
