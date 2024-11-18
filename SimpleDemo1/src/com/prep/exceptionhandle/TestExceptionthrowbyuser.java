package com.prep.exceptionhandle;

public class TestExceptionthrowbyuser {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		try {
			System.out.println(1/0);
	} 
			//catch (ArithmeticException e) {
//			// TODO Auto-generated catch block
//			//throw new ArithmeticException("Don't divide by zero");
//		}
			catch (ArithmeticException e2) {
				// TODO: handle exception
				//throw new ArithmeticException("Don't divide by zero");
				throw new LoginException("Login failed"); //Explicitly given by user as we created another class for this Loginexception and throwed here.
			}

	}

}
