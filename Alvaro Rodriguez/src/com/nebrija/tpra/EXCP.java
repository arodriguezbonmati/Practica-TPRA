package com.nebrija.tpra;

public class EXCP {
	EXCP(){
	}
	
public void validateI(String i) throws MyException{
		if(!i.equals("Alvaro")) {
			throw new MyException("Incorrect user");
		}
	}

public void validateE(String d)throws MyException{
	if(!d.equals("alvaro@gmail.com")){
		throw new MyException("Incorrect email");
		}
	}

public void validateP(String t)throws MyException{
	if(!t.equals("qwerty")){
		throw new MyException("Incorrect password");
		}
	
	}

}