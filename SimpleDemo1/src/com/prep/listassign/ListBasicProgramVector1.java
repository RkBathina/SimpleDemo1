package com.prep.listassign;

import java.util.Arrays;
import java.util.Vector;

public class ListBasicProgramVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to print duplicate elem with repetition count
		Object[] obj = new Object[]{"baby","ball","soap","baby","shampoo","chalk","soap","makeup","baby","lotion"};
		Vector<String> v = new Vector<>();
		v.add("baby");
		v.add("ball");
		v.add("soap");
		v.add("baby");
		v.add("shampoo");
		v.add("chalk");
		v.add("soap");
		v.add("makeup");
		v.add("baby");
		v.add("lotion");
		
		
		for(int i=0;i<v.size();i++) {
			int count =0;
			String curr = v.get(i);
			for(int j=0;j<v.size();j++) {
				if(curr.equals(v.get(j))) {
					count= count+1;
				}
			}
			if(count>1) {
				System.out.println(curr + "-" +count);
			for(int k=0;k<v.size();k++) {
				if(curr.equals(v.get(k))) {
					v.remove(k);
					//k--;
					//System.out.println(v);
				}
			}	
			
		}
		}

	}

}
