package com.prep.fileopert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ProgramBufferedread {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =  new File("./sample.txt");
		if(file.exists() == false) {
			System.out.println(file.createNewFile());
			}
		FileReader fileReader = new FileReader(file);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis);
		//Bufferedreader can use both filereader and inputstreamreader
		//BufferedReader br = new BufferedReader(fileReader);
		
		BufferedReader br = new BufferedReader(isr);
		String string = new String();
		String text = new String();
		while((string = br.readLine()) !=  null) {
			System.out.println(string);
			text += string;
		}
		
		System.out.println(text);
		fis.close();
		isr.close();
		br.close();
		fileReader.close();
	}
	

}

// Best and easy combination File reader with buffered reader we can get all the functionalities
