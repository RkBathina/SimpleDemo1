package com.prep.exceptionhandle;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File file = new File("D:\\TestFiles\\resume.txt"); //Absolute path in some disk
		
		//File file = new File("./resume.txt"); //creates new file in our current directory
//		
//		File file = new File("./Resources/Test"); // creaating one new folder use mkdir(), to create multiple folders use mkdirs()
//		System.out.println( file.mkdirs());
		
		//System.out.println(file.exists());
//		System.out.println(file.delete());
//		System.out.println(file.createNewFile());
		
//		if(file.exists()==true) {
//			System.out.println(file.delete());
//		}else {
//			System.out.println(file.createNewFile());
//		}
		
		//System.out.println(file.isHidden());
//		System.out.println(file.canWrite());
//		file.setWritable(true);
//		System.out.println(file.canWrite());
//		System.out.println(file.canRead());
		
		File file = new File("D:\\Work Spaces\\eclipse-Javaworkspace\\SimpleDemo1\\resume.txt");//
//		System.out.println(file.getName());
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getParent());
		File f2 = new File(file.getParent()+"/resume2.docx");
//		System.out.println(f2.createNewFile());
		System.out.println(new Date(file.lastModified()));
		System.out.println(file.isFile());
//		System.out.println(Arrays.toString(file.listFiles())); //to print path of each fileor folder inthat folder
//		for(String fname : file.list()) {
//			System.out.println(fname);
//		}
		
				
		
	}

}

