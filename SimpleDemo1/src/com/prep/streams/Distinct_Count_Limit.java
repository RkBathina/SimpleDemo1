package com.prep.streams;

import java.util.stream.Collectors;
import java.util.*;

public class Distinct_Count_Limit {

	public static void main(String[] args) {
		
	List<String> vehiclelist = Arrays.asList("bus", "car", "bcycle", "bus", "car", "car", "bike");
	
	//distinct obj without streams
	
	List<String> vehiclelist1=  vehiclelist.stream().distinct().collect(Collectors.toList());
	System.out.println(vehiclelist1);
	
	//count
	System.out.println(vehiclelist.stream().distinct().count());
	
	//limit
	vehiclelist.stream().limit(5).forEach(b->System.out.println(b));
	
	
	//count for even
	List<Integer> al = Arrays.asList(10,15,20,25,30);
	long c =al.stream().filter(n->n%2==0).count();
	System.out.println(c);
	
	//min non terminal method
	Optional<Integer> x =al.stream()
			.min((val1, val2)->{
			return val1.compareTo(val2);
			});
	System.out.println(x.get());
	System.out.println(x);
	
	//max
	Optional<Integer> mx = al.stream().max((val1, val2)->{return val1.compareTo(val2);});
	System.out.println(mx.get());
	
	//reduce
	List<String> stringlist = Arrays.asList("A", "B", "C", "1", "2", "3");
	Optional<String> s = stringlist.stream().reduce((value, combval)->
						{
							return combval+value;
						});
	System.out.println(s.get());
	
	//toarray
	List<String> slist = Arrays.asList("A", "B", "C", "1", "2", "3");
	Object[] s1= slist.stream().toArray();
	
	//System.out.println(s1);
	
	for (Object object : s1) {
		System.out.println(object);
	}
	
	}

}
