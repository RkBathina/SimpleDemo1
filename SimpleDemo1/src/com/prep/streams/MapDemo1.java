package com.prep.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Kittu", "Bathina", "Jon", "Sansa", "Joffrey", "Pandu");
		List<String> result = new ArrayList<>();
		List<Integer> length = new ArrayList<>();
		Integer arr[] = new Integer[] {3,4,5,6,7};
		String s1[] = new String[] {"kittu","Bathina"};
		List<Integer> sum = new ArrayList<>(Arrays.asList(arr));
		
		//without stream
//		for (String string : names) {
//			result.add(string.toUpperCase());
//		}
//		
//		System.out.println(result);
		
		//with streams
		result= names.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
		System.out.println(result);
		
		names.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
		System.out.println();
		names.stream().map(n -> n.toUpperCase()).forEach(System.out::println);
		
		
		
		System.out.println();
		//without streams
		for (String str : names) {
			System.out.println(str.length());
		}

		
		
		length = names.stream().map(n -> n.length()).collect(Collectors.toList());
		System.out.println(length);
		
		sum.stream().map(n -> n*3).forEach(tot -> System.out.println(tot));
		
	}
	
	

}
