package com.prep.exceptionhandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestExceptmultiplcatch {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File file =  new File("./sample.txt");
		if(file.exists() == false) {
			System.out.println(file.createNewFile());
			}
		
		try(
				FileReader fileReader = new FileReader(file);         
				FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr);
				) {
			String string = new String();
			String text = new String();
			while((string = br.readLine()) !=  null) {
				//System.out.println(string);
				text += string + "\n";
			}
			
			System.out.println(text);
			
			//use of mul catch
			int a[] = {1,2};
			System.out.println(a[0]/0);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}catch (ArithmeticException e2) {
			e2.printStackTrace();
			System.err.println("Don't divide num with 0");
		}catch (ArrayIndexOutOfBoundsException e3) {
			e3.printStackTrace();
			System.err.println("Use index within range");
		}

	}

}
