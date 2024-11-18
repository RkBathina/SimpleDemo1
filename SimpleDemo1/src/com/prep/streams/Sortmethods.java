package com.prep.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Sortmethods {

	//SOrt
	public static void main(String[] args) {
	
		List<Integer> l1 = Arrays.asList(5,2,4,1,3,7,6,9);
		l1.stream().sorted().forEach(n->System.out.print(n));//sorted
		System.out.println();
		l1.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n));//reverse order
		System.out.println();
		
		//string sort
		List<String> names = Arrays.asList("Kittu", "Bathina", "Jon", "Sansa", "Joffrey");
		List<String> sortname = names.stream().sorted().collect(Collectors.toList());
		System.out.println(sortname);
		
		//reverse
		names.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
		
		
		
		
	}

}
