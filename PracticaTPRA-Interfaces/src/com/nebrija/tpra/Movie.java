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
	
	static Movie movie1=new Movie(Translate.getString28(), 100, Translate.getString33(), 20);
	static Movie movie2=new Movie(Translate.getString29(), 30, Translate.getString34(), 25);
	static Movie movie3=new Movie(Translate.getString30(), 55, Translate.getString35(), 15);
	static Movie movie4=new Movie(Translate.getString31(), 200, Translate.getString36(), 30);
	static Movie movie5=new Movie(Translate.getString32(), 50, Translate.getString37(), 10);

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
			System.out.println(Translate.getString17()+" "+movie1.movie_genre);
			System.out.println(movie1.movie_stock+" "+Translate.getString21());
			System.out.println(Translate.getString22()+" "+movie1.movie_price+"€.");
			System.out.println();
			System.out.println(movie2.movie_name+".");
			System.out.println(Translate.getString17()+" "+movie2.movie_genre);
			System.out.println(movie2.movie_stock+" "+Translate.getString21());
			System.out.println(Translate.getString22()+" "+movie2.movie_price+"€.");
			System.out.println();
			System.out.println(movie3.movie_name+".");
			System.out.println(Translate.getString17()+" "+movie3.movie_genre);
			System.out.println(movie3.movie_stock+" "+Translate.getString21());
			System.out.println(Translate.getString22()+" "+movie3.movie_price+"€.");
			System.out.println();
			System.out.println(movie4.movie_name+".");
			System.out.println(Translate.getString17()+" "+movie4.movie_genre);
			System.out.println(movie4.movie_stock+" "+Translate.getString21());
			System.out.println(Translate.getString22()+" "+movie4.movie_price+"€.");
			System.out.println();
			System.out.println(movie5.movie_name+".");
			System.out.println(Translate.getString17()+" "+movie5.movie_genre);
			System.out.println(movie5.movie_stock+" "+Translate.getString21());
			System.out.println(Translate.getString22()+" "+movie5.movie_price+"€.");
			System.out.println();
			System.out.println(Translate.getString23());
			buymovie=buymovie1.nextInt();
			
			if(buymovie==1) {
				System.out.println(Translate.getString24());
				System.out.println("1. "+movie1.movie_name+".");
				System.out.println("2. "+movie2.movie_name+".");
				System.out.println("3. "+movie3.movie_name+".");
				System.out.println("4. "+movie4.movie_name+".");
				System.out.println("5. "+movie5.movie_name+".");
				buybuy=buybuy1.nextInt();
				
				switch(buybuy) {
				
				case 1: System.out.println(Translate.getString25()+" "+movie1.movie_name+".");
				movie1.movie_stock--;
				Main.international();
				break;
				
				case 2: System.out.println(Translate.getString25()+" "+movie2.movie_name+".");
				movie2.movie_stock--;
				Main.international();
				break;
				
				case 3: System.out.println(Translate.getString25()+" "+movie3.movie_name+".");
				movie3.movie_stock--;
				Main.international();
				break;
				
				case 4: System.out.println(Translate.getString25()+" "+movie4.movie_name+".");
				movie4.movie_stock--;
				Main.international();
				break;
				
				case 5: System.out.println(Translate.getString25()+" "+movie5.movie_name+".");
				movie5.movie_stock--;
				Main.international();
				break;
			
				}
				
			
			}else {
				Main.international();
			}
	 }
	
}















