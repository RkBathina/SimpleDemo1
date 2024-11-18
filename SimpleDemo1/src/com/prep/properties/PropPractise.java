package com.prep.properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropPractise {

	public static void main(String[] args) throws IOException {
		File file = new File("dbConfig.properties");
		if(!file.exists()) {
			System.out.println(file.createNewFile());
		}System.out.println(file.exists());
		
		//Properties file handling
		Properties properties = new Properties(); 
		/*	properties.setProperty("url", "jdbc:mysql://localhost:3306/airlines");
		properties.setProperty("username", "root");
		properties.setProperty("password", "root"); */
		
		//To write data in file we can use streams or writers 
		
		//First implwmwnt with streams
	/*	FileOutputStream fos = new FileOutputStream(file);
		
		properties.store(fos, "new prop file created");*/
		
		//FileInputStream fis = new FileInputStream(file);
		FileReader fr = new FileReader(file);
		
		//InputStreamReader iis = new InputStreamReader(file);
		BufferedReader fis = new BufferedReader(fr);
		properties.load(fis);
		
		//retrieve keys return set as keys are unique
		System.out.println(properties.stringPropertyNames());
		Set<Object> keys = properties.keySet();
//		Set<String> keys = properties.stringPropertyNames();
		System.out.println(keys);
		
		
		//Retrieve values return collection as values can be duplicated
		System.out.println(properties.values());
		Collection<Object> vals = properties.values();
		System.out.println(vals);
		
		//retrieve specific key
		System.out.println(properties.getProperty("username"));
		
		//all values and keys
		System.out.println(properties);
		for (Object key : properties.keySet()) {
			System.out.println(key + ">>>>" +properties.getProperty((String)key));
		}
		
		Set<Entry<Object, Object>> dat = properties.entrySet();
		for (Entry<Object, Object> entry : dat) {
			System.out.println(entry.getKey()+"------" +entry.getValue() );
		}
		
		//update of data in prop file - same as hasmap we can take particular key and give nea value   
	}

}
