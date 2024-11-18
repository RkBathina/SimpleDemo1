package com.prep.fileopert;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ProgramFileoutputstream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file =  new File("./sample.txt");
		if(file.exists() == true) {
			System.out.println(file.delete());
		}else {
			System.out.println(file.createNewFile());
		}
		String s = "Hello All i'm kittu12";
		FileOutputStream fos = new FileOutputStream(file);
//		char[] c = s.toCharArray();
//		for(int i=0;i<c.length;i++) {
//			fos.write(c[i]);
//		}
		
	//	or
		for(char c : s.toCharArray()) {
			fos.write(c);
		}
		
		
		
//		fos.write(75);
//		fos.write(78);
//		fos.write(80);
		fos.close();
	}

}
