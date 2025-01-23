package com.prep.trees;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(3, "Three");  
        map.put(1, "One");    
        map.put(4, "Four");   
        map.put(2, "Two");    

        System.out.println(map); 
        
     
        System.out.println("\nValue for key 3: " + map.get(3)); 
        
        // Duplicate Keys (TreeMap does not allow duplicate keys)
        map.put(1, "Uno"); // Duplicate key, updates value
        System.out.println("\nADK - Duplicate Keys: " + map);  
        
     // Allow Duplicate Values (TreeMap allows duplicate values)
        map.put(5, "One"); // Duplicate value
        System.out.println("\nADV - Allow Duplicate Values: " + map);
        
     // TreeMap does not allow null keys)
        try {
            map.put(null, "NullKey"); 
        } catch (NullPointerException e) {
            System.out.println("\nANK - Allow Null Keys: Exception caught (NullPointerException).");
        }
        
      //  Allow Null Values (TreeMap allows null values)
        map.put(6, null);  
        System.out.println("\nANV - Allow Null Values: " + map);
        
        //Insertion Order (TreeMap does not preserve insertion order)
        System.out.println("\nIO - Insertion Order not followed, Sorted by Key): " + map);
        
        //  Random Access (TreeMap does not support random access)
        System.out.println("\nRA - Random Access: TreeMap does not support random access. Requires iteration.");
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        
        // Synchronization (TreeMap is not synchronized by default)
        Map<Integer, String> syncMap = Collections.synchronizedMap(map);
        synchronized (syncMap) {
            syncMap.put(7, "Seven");
            System.out.println("\nSYNC - Synchronization: " + syncMap);
        }

        
        System.out.println("\nConvert to uppercase:"+map.toString().toUpperCase());
        
        System.out.println("\nCharacter at position 2:" + map.toString().charAt(2));
        
        System.out.println("Contains key 1: " + map.containsKey(1));  
        System.out.println("Contains value 'Four': " + map.containsValue("Four"));  
        
        
        System.out.println("Size of TreeMap: " + map.size());  
        
       
        System.out.println("Is TreeMap empty " + map.isEmpty());  
        System.out.println("Entry Set:" + map.entrySet());
        
        map.remove(2);
        System.out.println("TreeMap after removal of key 2: " + map);  
        
       
        System.out.println("First key: " + ((TreeMap<Integer,String>) map).firstKey());  
        System.out.println("Last key: " + ((TreeMap<Integer,String>) map).lastKey());  
        
        System.out.println("Key set:" + map.keySet());
       
        
        map.clear();
        System.out.println("TreeMap after clear: " + map);  
        
        
    }
}
