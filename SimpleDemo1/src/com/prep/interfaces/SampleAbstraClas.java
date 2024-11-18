package com.prep.interfaces;

public abstract class SampleAbstraClas implements Laptop {
	
	@Override
	public void copy() {
		// TODO Auto-generated method stub
		System.out.println(" copy code common for all from sampleabstract class");
		
	}

	@Override
	public void paste() {
		// TODO Auto-generated method stub
		System.out.println(" paste code for all from sampleabstract class");
		
	}

	public abstract  void cut();
	public abstract void keyboard();


}

