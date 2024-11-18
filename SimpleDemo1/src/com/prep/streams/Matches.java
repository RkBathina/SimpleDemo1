package com.prep.streams;

import java.util.*;

public class Matches {

	public static void main(String[] args) {
		
		Set<String> al = new HashSet<>();
		al.add("One apple");
		al.add("One mango");
		al.add("Two apples");
		al.add("More grapes");
		al.add("Two guavas");
		
		System.out.println(al);
		//anymatch
		 boolean s = al.stream().anyMatch(val -> {
			return val.startsWith("One");
			}
		);
		 System.out.println(s);
		 
		 //all match
		 boolean s1= al.stream().allMatch(val -> {return val.startsWith("One");
		 }
		 );
		 System.out.println(s1);
		 
		 //nonematch
		 boolean s2= al.stream().noneMatch(val -> {return val.startsWith("O");
		 }
		 );
		 System.out.println(s2);
		 
		 //

	}

}
