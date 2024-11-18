package com.prep.arrrays;

public class ReverseArryandPRint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"true", "false", "false", "true", "false", "true"};
		String s1[] = new String[s.length];
		System.out.println(s.length);
		
		for(int i = s.length-1; i>=0; i-- ) {
			
			s1[i]=s[i];
			
		}System.out.println("Reversed Array: " + String.join(",", s1));

	}

}
