package com.prep.fileopert;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFilereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =  new File("./sample.txt");
		if(file.exists() == false) {
			System.out.println(file.createNewFile());
			}
		
		FileReader fileReader = new FileReader(file);
		String string = new String();
		int ascicode;
		while((ascicode = fileReader.read()) != -1) {
			System.out.print((char)ascicode);
			string += String.valueOf((char)ascicode);
		}
		System.out.println();
		System.out.println(string);
		
		fileReader.close();
	}

	
}
