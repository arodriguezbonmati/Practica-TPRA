package com.nebrija.tpra;
import java.util.Scanner;

public class Movie {
	private String movie_name;
	private int movie_stock;
	private String movie_genre;
	private int movie_price;
	
	public Movie(String movie_name, int movie_stock, String movie_genre, int movie_price) {
		this.movie_name=movie_name;
		this.movie_stock=movie_stock;
		this.movie_genre=movie_genre;
		this.movie_price=movie_price;
	}
	
	static Movie movie1=new Movie("Star Wars", 100, "Science-Fiction", 20);
	static Movie movie2=new Movie("The Shining", 100, "Horror", 25);

	//GETTERS
	public String getMovie_name() {
		return movie_name;
	}
	public int getMovie_stock() {
		return movie_stock;
	}
	public String getMovie_genre() {
		return movie_genre;
	}
	public int getMovie_price() {
		return movie_price;
	}
	public Movie getMovie1() {
		return movie1;
	}
	public Movie getMovie2() {
		return movie2;
	}
	
	//SETTERS
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public void setMovie_stock(int movie_stock) {
		this.movie_stock = movie_stock;
	}
	public void setMovie_genre(String movie_genre) {
		this.movie_genre = movie_genre;
	}
	public void setMovie_price(int movie_price) {
		this.movie_price = movie_price;
	}
	
	
	static Scanner buymovie1=new Scanner(System.in);
	 static int buymovie=0;
	 static Scanner buybuy1=new Scanner(System.in);
	 static int buybuy=0;
	 
	 static void movies() {
		 System.out.println(movie1.movie_name+".");
			System.out.println("Genre: "+movie1.movie_genre);
			System.out.println(movie1.movie_stock+" units left.");
			System.out.println("Price: "+movie1.movie_price+"€.");
			System.out.println();
			System.out.println(movie2.movie_name+".");
			System.out.println("Genre: "+movie2.movie_genre);
			System.out.println(movie2.movie_stock+" units left.");
			System.out.println("Price: "+movie2.movie_price+"€.");
			System.out.println();
			System.out.println("Would you like to buy one?(yes=1/no=0)");
			buymovie=buymovie1.nextInt();
			
			if(buymovie==1) {
				System.out.println("Which one?");
				System.out.println("1. "+movie1.movie_name+".");
				System.out.println("2. "+movie2.movie_name+".");
				buybuy=buybuy1.nextInt();
				
				switch(buybuy) {
				
				case 1: System.out.println("Successfully purchased "+movie1.movie_name+".");
				movie1.movie_stock--;
				break;
				
				case 2: System.out.println("Successfully purchased "+movie2.movie_name+".");
				movie2.movie_stock--;
				break;
			
				}
				
			
			}
	 }
	
}















