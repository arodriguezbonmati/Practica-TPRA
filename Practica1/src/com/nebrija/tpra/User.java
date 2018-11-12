package com.nebrija.tpra;

import java.util.Scanner;

public class User {
	
	private static String username="qwerty";
	private String email="qwerty@gmail.com";
	private static String password="qwerty1234";
	
	public User (String email, String username, String password) {
		
		this.email = email;
		this.username = username;
		this.password = password;
	}

	
	//GETTERS
	public String getemail() {
		return email;
	}
	
	public static String getusername() {
		return username;
	}

	public static String getpassword() {
		return password;
	}
	
	
	//SETTERS
	public void setemail(String email) {
		this.email=email;
	}
	
	public void setusername(String username ) {
		this.username=username;
	}
	
	public void setpassword(String password) {
		this.password=password;
	}

}
	
	




