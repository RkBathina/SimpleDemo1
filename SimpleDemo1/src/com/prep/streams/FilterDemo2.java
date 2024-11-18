package com.prep.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo2 {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Kittu", "Bathina", "Jon", "Sansa", "Joffrey");
		
		List<String> names1 = new ArrayList<>();
		
		names1= names.stream().filter(n -> n.length()>6 && n.length()<8).collect(Collectors.toList());
		System.out.println(names1);
		
		names.stream().filter(str -> str.length()>6 && str.length()<8).forEach(System.out::println);
		names.stream().filter(str -> str.length()>6 && str.length()<8).forEach(n -> System.out.println(n));
		
		//Collection with null and filter them
		
		List<String> words = Arrays.asList("Cup",null, "Bathina", "Kittu", null, null,"Jon", "Sansa", "Joffrey");
		List<String> words1 = new ArrayList<>();
		
		words1 = words.stream().filter(n -> n!=null).collect(Collectors.toList());
		System.out.println(words1);
		
		words.stream().filter(n -> n!=null).forEach(n->System.out.println(n));
		words.stream().filter(n -> n!=null).forEach(System.out::println);
		
		//
	}

}
