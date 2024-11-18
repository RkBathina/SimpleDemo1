package com.prep.fileopert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ProgramBufferedwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =  new File("./sample.txt");
//		if(file.exists() == true) {
//			System.out.println(file.delete());
//		}else {
//			System.out.println(file.createNewFile());
//		}
		
		if(file.exists() == false) {
			System.out.println(file.createNewFile());
			}
		String existtext = new String();
		String line ="";
		BufferedReader br = new BufferedReader(new FileReader(file));
		while((line = br.readLine()) != null) {
			existtext += line +"\n";
		}
		br.close();
		
		String s = "i'm kittu1999";
		FileWriter fiw = new FileWriter(file);
		//OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fiw);
		BufferedWriter bufferedWriter = new BufferedWriter(fiw);
		bufferedWriter.write(existtext+s);
		
		bufferedWriter.flush();
		bufferedWriter.close();
		fiw.close();
	}

}
