package com.prep.exceptionhandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
//Try with resource concept
public class TestExcept2 {

	public static void main(String[] args) throws Throwable  {
		// TODO Auto-generated method stub
		File file =  new File("./sample.txt");
		if(file.exists() == false) {
			System.out.println(file.createNewFile());
			}
		//In side this try param we can only pass stmts(Resources i.e filereader,fileipstream,bufferedread etc) which implemets AutoClosable interface .
		try(
				FileReader fileReader = new FileReader(file);          //As we passed all these file handling stmts as param it is called as resources and this concept is try with resources
				FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis);
				//Bufferedreader can use both filereader and inputstreamreader
				//BufferedReader br = new BufferedReader(fileReader);
				BufferedReader br = new BufferedReader(isr);
				) {
			String string = new String();
			String text = new String();
			while((string = br.readLine()) !=  null) {
				//System.out.println(string);
				text += string + "\n";
			}
			
			System.out.println(text);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
//		fis.close();
//		isr.close();
//		br.close();
//		fileReader.close();

	}

}
