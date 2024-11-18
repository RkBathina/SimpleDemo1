package com.prep.listassign;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class ListBasicProgramVector3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List of common elem between two lists
		Vector<Integer> v1 = new Vector<>();
		v1.add(4);
		v1.add(9);
		v1.add(8);
		v1.add(5);
		Vector<Integer> v2 = new Vector<>();
		v2.add(1);
		v2.add(8);
		v2.add(0);
		v2.add(5);
		v2.add(1);
		v2.add(6);
		v2.add(5);
		
		Vector<Integer> v3 = new Vector<>();
		
		for(int i=0;i<v1.size();i++) {
			int elem = v1.get(i);
			for(int j=0;j<v2.size();j++) {
				if(elem == v2.get(j) && !v3.contains(elem)) {
					v3.add(elem);
				}
			}
		}
		System.out.println(v3);
		
		//program to print list of prime numbers until 50
		Vector<Integer> v4 = new Vector<>();
		int limit =50;
		for(int i=2;i<=limit;i++) {
			Boolean flag = true;
			for(int j=2;j<=i/2;j++) {
				if(i%j == 0) {
					flag = false;
					break;
				}
			}if(flag)
			{
				v4.add(i);
			}
			
		}System.out.println(v4);
		
		//Convert list to array
		
		System.out.println(Arrays.toString(v4.toArray()));
		
		Vector<Integer> v5 = new Vector<>();
		v5.add(4);
		v5.add(9);
		v5.add(8);
		
		Vector<Integer> v6 = new Vector<>();
		v6.add(4);
		v6.add(1);
		v6.add(9);
		v6.add(4);
		v6.add(8);
		v6.add(0);
		v6.add(5);
		v6.add(1);
		v6.add(8);
		v6.add(6);
		
		v6.removeAll(v5);
		
		System.out.println(v6 );
		
		int x =0;
		
		System.out.println(v2.get(x));
		
		for(int i = v6.size()-1;i>=0;i--) {
			System.out.println(Arrays.asList(v6.get(i)));
		}
		
	}

}
