package com.prep.exceptionhandle;


public class LoginException extends Exception{
//Login exception defined by user u can use this exception in any catch block in codes.
	public LoginException(String s) {
		super(s);
	}
}
