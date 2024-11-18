 package com.prep.interfaces;

public interface Laptop {
	//these are the 4 abstarct methods
	public void copy();
	public void paste();
	public void cut();
	public void keyboard();
	
	
	//Added this 2 feature from java 8
	default void security() {
		commoncode();
		System.out.println("Laptop security code/if needed u can implement");
	}
	
	public static void audio() {
		commoncode();
		System.out.println("Laptop audio code/if needed u can implement");
	}
	
	//From java 9 private method/static private declaration added for code resuability inside interfaces
	private static void commoncode() {
		System.out.println("Common code");
	}

}

