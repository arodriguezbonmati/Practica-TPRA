package com.nebrija.tpra;
import java.util.Scanner;

public class Book {
	private String book_name;
	private int book_stock=0;
	private  String book_genre;
	private int book_price=0;
	
	public Book(String book_name, int book_stock, String book_genre, int book_price) {
		this.book_name=book_name;
		this.book_stock=book_stock;
		this.book_genre=book_genre;
		this.book_price=book_price;
	}
	
	static Book book1=new Book("The Lord of the Rings", 100, "Adventure", 20);
	static Book book2=new Book("The Da Vinci Code", 100,"History", 30);
	
	//GETTERS
	public String getBook_name() {
		return book_name;
	}
	public int getBook_stock() {
		return book_stock;
	}
	public String getBook_genre() {
		return book_genre;
	}
	public int getBook_price() {
		return book_price;
	}
	public Book getBook1() {
		return book1;
	}
	public Book getBook2() {
		return book2;
	}
	
	//SETTERS
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public void setBook_stock(int book_stock) {
		this.book_stock = book_stock;
	}
	public void setBook_genre(String book_genre) {
		this.book_genre = book_genre;
	}
	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}
	public void setBook1(Book book1) {
		this.book1 = book1;
	}
	public void setBook2(Book book2) {
		this.book2 = book2;
	}
	
	 static Scanner buybook1=new Scanner(System.in);
	 static int buybook=0;
	 static Scanner buy1=new Scanner(System.in);
	 static int buy=0;
	 
	static void books() {
		System.out.println(book1.book_name+".");
		System.out.println("Genre: "+book1.book_genre);
		System.out.println(book1.book_stock+" units left.");
		System.out.println("Price: "+book1.book_price+"€.");
		System.out.println();
		System.out.println(book2.book_name+".");
		System.out.println("Genre: "+book2.book_genre);
		System.out.println(book2.book_stock+" units left.");
		System.out.println("Price: "+book2.book_price+"€.");
		System.out.println();
		System.out.println("Would you like to buy one?(yes=1/no=0)");
		buybook=buybook1.nextInt();
		
		if(buybook==1) {
			System.out.println("Which one?");
			System.out.println("1. "+book1.book_name+".");
			System.out.println("2. "+book2.book_name+".");
			buy=buy1.nextInt();
			
			switch(buy) {
			
			case 1: System.out.println("Successfully purchased "+book1.book_name+".");
			book1.book_stock--;
			break;
			
			case 2: System.out.println("Successfully purchased "+book2.book_name+".");
			book2.book_stock--;
			break;
		
			}
			
		
		}
	}
	
}














