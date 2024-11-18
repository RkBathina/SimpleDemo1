package com.prep.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo1 {

	public static void main(String[] args) {
		List<Integer> sum = Arrays.asList(1,2,3,4,5,6);
		
		//map
	    List<Integer> l1 =sum.stream().map(n -> n+10).collect(Collectors.toList());
	    System.out.println(l1);
	    
	    //FlatMap
	    
	    List<Integer> ls1 = Arrays.asList(1,2);
	    List<Integer> ls2 = Arrays.asList(3,4);
	    List<Integer> ls3 = Arrays.asList(5,6);
	    
	    List<List<Integer>> mlist = Arrays.asList(ls1, ls2, ls3); //Collection inside collection (ListInt collection inside list collection)
	    System.out.println(mlist);
	    
	   List<Integer> flist = mlist.stream()
			   .flatMap(ls -> ls.stream()) // Flat map returns stream of objs, here it will rreturn 3 streams
			   .map(n -> n+10)
			   .collect(Collectors.toList());
	   System.out.println(flist);
	   
	   
	   List<String> s1 = Arrays.asList("Kittu", "Bathina", "Pandu");
	   List<String> s2 = Arrays.asList("Sai", "Ram", "Rohit");
	   List<String> s3 = Arrays.asList("Lak", "Naga", "Bab");
	   
	   List<List<String>> fs = new ArrayList<>();
	   fs.add(s1);
	   fs.add(s2);
	   fs.add(s3);
	   
	   System.out.println(fs);
	   System.out.println();
	   //without streams print all the names
	   for (List<String> list : fs) {
		for (String list2 : list) {
			System.out.println(list2);
		}
	}
	   System.out.println();
	  List<String> fls = fs.stream()
			  .flatMap(n -> n.stream())
			  .collect(Collectors.toList());
	   System.out.println(fls);
	}

}
