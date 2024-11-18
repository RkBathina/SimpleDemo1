package com.prep.listassign;

import java.util.Vector;

public class ListBasicProgramVector4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ascending order
		Vector<Integer> v6 = new Vector<>();
		v6.add(4);
		v6.add(1);
		v6.add(9);
		v6.add(4);
		v6.add(8);
		v6.add(0);
		v6.add(5);
		v6.add(8);
		v6.add(1);
		v6.add(8);
		v6.add(6);
		
		Vector<Integer> v7 = new Vector<>();
		Vector<Integer> v8 = new Vector<>();
		
		System.out.println(v6);
		
		int maxelem = v6.get(0);
		int maxcount=1;
		//boolean found= false;
		for(int k=0;k<v6.size();k++) {
			int count=0;
			int curr = v6.get(k);
			for(int z=0;z<v6.size();z++) {
				if(curr== v6.get(z)) {
					count =  count+1;
				}
			}
				if(count == 1) {
				System.out.println(curr +" - "+count);
				//found = true;
				break;
			}
			}
		}
}
		
		
		
		
		
//		int temp = 0;
//		for(int i=0;i<v6.size();i++) {
//			for(int j=i+1;j<v6.size();j++) {
//				if(v6.get(i) > v6.get(j)) {
//					temp = v6.get(j);
//					v6.set(j, v6.get(i));
//					v6.set(i, temp);
//				}
//			}
//		}
//	//	System.out.println(v6);
//		
//		//Descending orde order
//		int temp1=0;
//		for(int i=0;i<v6.size();i++) {
//			for(int j=i+1;j<v6.size();j++) {
//				if(v6.get(i) < v6.get(j)) {
//					temp1 = v6.get(j);
//					v6.set(j, v6.get(i));
//					v6.set(i, temp1);
//				}
//			}
//		}
//	//	System.out.println(v6);


