package com.prep.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Find {

	public static void main(String[] args) {
		
		List<String> slist = Arrays.asList("one", "two", "three", "one");
		
		//findany
		Optional<String> e= slist.stream().findAny();
		System.out.println(e.get());
		
		//findfirst
		Optional<String> e1= slist.stream().findFirst();
		System.out.println(e1.get());
	}

}
