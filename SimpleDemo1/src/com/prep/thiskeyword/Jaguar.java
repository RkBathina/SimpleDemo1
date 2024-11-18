package com.prep.thiskeyword;

public class Jaguar implements Car{

	public static void main(String[] args) {
		Jaguar j = new Jaguar();
		j.headLight();
		
		AbstrJaguar aj = new AbstrJaguar() {
			
			@Override
			public void drive() {
				
				
			}
			
		};aj.setCarNAme("JaguarABstract");
		System.out.println(aj.getCarName());

	}

	@Override
	public void drive() {
		
		
	}
	
	public void breaks() {
		
	}

}
