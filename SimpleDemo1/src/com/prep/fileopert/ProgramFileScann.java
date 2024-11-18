package com.prep.fileopert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ProgramFileScann {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =  new File("./sample.txt");
		if(file.exists() == false) {
			System.out.println(file.createNewFile());
			}
		//we can provide fileinput stream instance
		
		FileInputStream fileInputStream = new FileInputStream(file);
		//scanner for files
		//Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(fileInputStream);
		String string= new String();
		while(sc.hasNextLine()) {
			//System.out.println(sc.nextLine());
			string += sc.nextLine() + "\n";
		}
		System.out.println(string);
		sc.close();
		
	}
}
