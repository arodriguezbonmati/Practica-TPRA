package com.nebrija.tpra;

import java.util.Scanner;

public class User {
	
	private static  String username;
	private static  String email;
	private static  String password;
	
	public User (String username, String email, String password) {
		
		this.username= username;
		this.email = email;
		this.password = password;
	}
	
	static User user1 = new User("Alvaro", "alvaro@gmail.com", "qwerty");
	
	
	
	//GETTERS
	public static String getUsername() {
		return username;
	}

	public static String getEmail() {
		return email;
	}

	public static String getPassword() {
		return password;
	}

	//SETTERS
	public void setUsername(String username) {
		this.username = username;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	} 

	@SuppressWarnings("unlikely-arg-type")
	public static void LogIn() {
		System.out.println("Introduce the necessary data");
		System.out.print("Username: ");
		Scanner username=new Scanner(System.in);
		String username_1;
		username_1=username.nextLine();
		System.out.print("Email: ");
		Scanner email=new Scanner(System.in);
		String email_1;
		email_1=email.nextLine();
		System.out.print("Password: ");
		Scanner password=new Scanner(System.in);
		String password_1;
		password_1=password.nextLine();
		
		if(username_1.equals(User.getUsername()) && email_1.equals(User.getEmail()) && password_1.equals(User.getPassword())) {
			Main.menu();
		}else {
			EXCP k = new EXCP();
			try{
				k.validateI(username_1);
			}catch(MyException e){
				
				e.printStackTrace();
			}
			try{
				k.validateE(email_1);
			}catch(MyException e){
				
				e.printStackTrace();
			try{
				k.validateP(password_1);
			}catch(MyException e1){
				
				e1.printStackTrace();	
			}
			password.close();
			}
		}
	}
	
}




