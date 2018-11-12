package com.nebrija.tpra;



public class MyException extends Exception {
	
	public MyException() {
		
	}
	
	
	
	
	static void search(String username) throws MyException{
		
		if(username != User.getusername() ) {
			throw new MyException ("Incorrect username");
		}
		
	}
	
	
	
	
	
	public MyException(String username_error) {
		
		super(username_error);
	}
}
