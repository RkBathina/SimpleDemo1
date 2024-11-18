package com.prep.listassign;

import java.util.Currency;
import java.util.Vector;

public class ListBasicProgramVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//highest num of duplicate elem in list
		Vector<Integer> v = new Vector<>();
		v.add(4);
		v.add(1);
		v.add(9);
		v.add(4);
		v.add(8);
		v.add(0);
		v.add(5);
		v.add(8);
		v.add(1);
		v.add(8);
		v.add(6);
		
		int maxelem = v.get(0);
		int maxcount=1;
		for(int i=0;i<v.size();i++) {
			int count=0;
			int curr = v.get(i);
			for(int j=0;j<v.size();j++) {
				if(curr== v.get(j)) {
					count = count+1;
				}
				
			}
			if(count>maxcount) {
				maxcount = count;
				maxelem =curr;
			}
			//delete duplicate elem in list
			if(count>1) {
				for(int k=0;k<v.size();k++) {
					if(curr == v.get(k)) {
						v.remove(k);
					}
			}
			
			}

			
		}
		System.out.println(maxelem +" - " +maxcount);
		System.out.println(v);
		
		
	}

}
