package com.prep.streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatinateSTream {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Kittu", "Bathina", "Jon", "Sansa", "Joffrey");
		List<String> slist = Arrays.asList("one", "two", "three", "four");
		
		
		Stream<String> s= names.stream();
		System.out.println(s);
		
		Stream<String> s1 = slist.stream();
		
		List<String> s2 = Stream.concat(s, s1).collect(Collectors.toList());
		System.out.println(s2);
	}

}
