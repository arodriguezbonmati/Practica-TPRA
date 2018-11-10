package com.nebrija.tpra;

public class User {
	
	private String email, username, password;
	
	public User (String email, String username, String password) {
		
		this.email = email;
		this.username = username;
		this.password = password;
	}

	
	//GETTERS
	public String getemail() {
		return email;
	}
	
	public String getusername() {
		return username;
	}

	public String getpassword() {
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
