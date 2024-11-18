package com.prep.fileopert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Programtextfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =  new File("./sample.txt");
		if(file.exists() == false) {
			System.out.println(file.createNewFile());
		}
//		else {
//			System.out.println(file.delete());
//		}
		
		//File Input stream
		FileInputStream fileInputStream = new FileInputStream(file);
//		for(int i=0;i<fileInputStream.available();i++) {
//			System.out.println((char)fileInputStream.read()); //while loop is better as we don't know how many char sre there
//		}
		int asccicode;
		String string = new String();
		while((asccicode = fileInputStream.read()) != -1) {
			string += String.valueOf((char)asccicode);
			System.out.print((char) asccicode);
		}
		System.out.println();
		System.out.println(string);
		fileInputStream.close();
	}

}
 