package com.prep.listassign;

import java.util.Vector;

public class ListBasicProgramVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v = new Vector<>();
		v.add(4);
		v.add(9);
		v.add(8);
		v.add(5);
		v.add(0);
		v.add(10);
		
		//Sum and Avg of elem in list
		int sum=0;
		double avg;
		for(int i=0;i<v.size();i++) {
			sum += v.get(i);
		}
		avg = sum/v.size();
		System.out.println(sum);
		System.out.println(avg);
		
		//sum of even num in a list
		int esum=0;
		for(int i=0;i<v.size();i++) {
			if(v.get(i)%2 == 0) {
				esum += v.get(i);
			}
		}System.out.println(esum);
		
		// Split list into twolists into half
		Vector<Integer> v1 = new Vector<>();
		Vector<Integer> v2 = new Vector<>();
		
		for(int i=0;i<v.size();i++) {
			if(i<v.size()/2) {
				v1.add(v.get(i));
			}else {
				v2.add(v.get(i));
			}
		}
		System.out.println(v1);
		System.out.println(v2);
		
		//Merge two lists into single
		Vector<Integer> v3 = new Vector<>();
		v3.addAll(v1);
		v3.addAll(v2);
		System.out.println(v3);
		
	}

}
