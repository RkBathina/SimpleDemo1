package com.prep.trees;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(3);  
        set.add(1);  
        set.add(4);  
        set.add(2);  
         

        System.out.println(set); 
        
        // Allow Duplicates (TreeSet does not allow duplicates)
        set.add(4); 
        System.out.println("\nAD - Allow Duplicates: " + set); 
        
        // Allow Null Values (TreeSet doesnot  allows null values)
        try {
        	set.add(null);
		} catch (NullPointerException e) {
			System.out.println("\nAN - Allow Null Values: Dont Nullpointer exception");
		}
        
        // Insertion Order (TreeSet does not preserve insertion order)
        System.out.println("\nIO - Insertion Order Not Preserved, Sorted by Element): " + set); 
        
     // Sorted Order (TreeSet stores elements in sorted order by default)
        set.add(10);
        System.out.println("\nSO - Sorted Order: " + set);
        
     // Random Access (TreeSet does not support random access, requires iteration)
        System.out.println("\nRA - Random Access: TreeSet does not support random access. Iterating through elements.");
        for (Integer element : set) {
            System.out.println(element);
        }
        
     //  Synchronization (TreeSet is not synchronized by default)
        Set<Integer> syncSet = Collections.synchronizedSet(set);
        synchronized (syncSet) {
        	syncSet.add(35);
            System.out.println("\nSYNC - Synchronization: " + syncSet);
        }
        
        set.remove(2);
        System.out.println("\ntreeSet after removal of 2: " + set); 
        
       
        System.out.println("Contains 3: " + set.contains(3));  
        System.out.println("Contains 2: " + set.contains(2));  
        
        
        System.out.println("Size of TreeSet: " + set.size());  
        
        
        System.out.println("Is TreeSet empty " + set.isEmpty()); 
        
        System.out.println("First element: " + ((TreeSet<Integer>) set).first());  
        System.out.println("Last element: " + ((TreeSet<Integer>) set).last());  
       
        set.stream().map(n -> n*2).forEach(System.out::println);
   
        
        // Clearing all elements from the TreeSet
        set.clear();
        System.out.println("TreeSet after clear: " + set);  // []
    }
}
