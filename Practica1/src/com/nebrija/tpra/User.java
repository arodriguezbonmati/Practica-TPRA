package com.nebrija.tpra;

public class User {
	
	private static String username="qwerty";
	private static String email="qwerty@gmail.com";
	private static String password="qwerty1234";
	
	public User (String email, String username, String password) {
		
		User.email = email;
		User.username = username;
		User.password = password;
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
		User.email=email;
	}
	
	public void setusername(String username ) {
		User.username=username;
	}
	
	public void setpassword(String password) {
		User.password=password;
	}

}
	
	




