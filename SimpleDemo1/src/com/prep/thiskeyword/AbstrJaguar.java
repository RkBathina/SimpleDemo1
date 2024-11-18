package com.prep.thiskeyword;

public abstract class AbstrJaguar implements Car {
	String name = "Jaguar";

	
	public void setCarNAme(String name) { //this key word abstracrt class
		this.name = name;
	}
	
	public String getCarName() {
		return name;
	}

}
