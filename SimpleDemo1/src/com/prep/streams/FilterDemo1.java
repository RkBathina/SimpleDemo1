package com.prep.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {

	public static void main(String[] args) {
		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(10);
//		al.add(15);
//		al.add(20);
//		al.add(25);
//		al.add(30);
		
		List<Integer> al = Arrays.asList(10,15,20,25,30);
		
		List<Integer> Evenal = new ArrayList<>();
		
		//without streams
		/*for (Integer n : al) {
			if(n%2==0) {
				Evenal.add(n);
			}
		}
		System.out.println(Evenal);*/
		
		//with streams and filter
		
		//System.out.println(Arrays.asList(al.stream().toArray()));
		
		
	   Evenal = al.stream().filter(n -> n%2==0).collect(Collectors.toList()); // In filter it takes predicate (returns boolean) lambda expression
	   System.out.println(Evenal);
	   
	   al.stream().filter(n -> n%2==0).forEach(n -> System.out.println(n)); //In foreach it takes consumer(consumes value) lambda expression
		                //or
	   al.stream().filter(n -> n%2==0).forEach(System.out::println);

	}

}
