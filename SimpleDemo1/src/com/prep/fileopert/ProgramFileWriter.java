package com.prep.fileopert;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramFileWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =  new File("./sample.txt");
		if(file.exists() == true) {
			System.out.println(file.delete());
		}else {
			System.out.println(file.createNewFile());
		}
		String s = "Hello All i'm ";
		FileWriter fiw = new FileWriter(file);
		char[] ch = s.toCharArray();
		//FileOutputStream fos = new FileOutputStream(file);
		//fiw.write(s);
		fiw.write(ch);
		fiw.close();

	}

}
