package com.nebrija.tpra;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		User.LogIn();
	}
	@SuppressWarnings("resource")
	static void change() {
		
		Scanner answer1=new Scanner(System.in);
 		int answer=0;
 		
 		Scanner price1=new Scanner(System.in);
        double price = 0;
        
        System.out.println("Enter the amount of € you want to convert into $");
		 price = price1.nextInt();
		 
		 System.out.println("If you want to convert "+price+"€ to $ press 1");
		 answer=answer1.nextInt();
		 
		switch(answer) {
		case 1:
			double price2 = 0;
			 price2 = price * 1.15;
			 System.out.println(price+"€ equals to "+price2+"$.");
			 System.out.println("");
			 break;
		
		 }
	}
	
	static void search() {
		Scanner s1=new Scanner(System.in);
		int s=0;
		System.out.println("1. Books.");
		System.out.println("2. Movies.");
		Scanner search1=new Scanner(System.in);
		int search=0;
		search=search1.nextInt();
		if(search==1) {
			System.out.println("BOOKS:");
			System.out.println("	1. Adventure.");
			System.out.println("	2. Science");
			System.out.println("	3. History");

			
			s=s1.nextInt();
			
			switch(s) {
			case 1: 
				System.out.println(Book.book1.getBook_name());
				System.out.println(Book.book1.getBook_price()+"€.");
				System.out.println();
				System.out.println(Book.book2.getBook_name());
				System.out.println(Book.book2.getBook_price()+"€.");
				System.out.println();
				System.out.println(Book.book3.getBook_name());
				System.out.println(Book.book3.getBook_price()+"€.");
				System.out.println();
			break;
			
			case 2:
				System.out.println(Book.book3.getBook_name());
				System.out.println(Book.book3.getBook_price()+"€.");
				System.out.println();
			break;
			
			case 3:
				System.out.println(Book.book2.getBook_name());
				System.out.println(Book.book2.getBook_price()+"€.");
				System.out.println();
			}
			
		}else;
		
		if(search==2) {
			Scanner sa1=new Scanner(System.in);
			int sa=0;
			System.out.println("MOVIES:");
			System.out.println("	1. Science-Fiction.");
			System.out.println("	2. Horror.");
			System.out.println("	3. War.");
			System.out.println("	4. Family Entertainment.");
			System.out.println("	5. Action.");
			
			
			sa=sa1.nextInt();
			
			switch(sa) {
			case 1:
				System.out.println(Movie.movie1.getMovie_name());
				System.out.println(Movie.movie1.getMovie_price()+"€.");
				System.out.println();
			break;
			
			case 2:
				System.out.println(Movie.movie2.getMovie_name());
				System.out.println(Movie.movie2.getMovie_price()+"€.");
				System.out.println();
			break;
			
			case 3:
				System.out.println(Movie.movie3.getMovie_name());
				System.out.println(Movie.movie3.getMovie_price()+"€.");
				System.out.println();
			break;
			
			case 4:
				System.out.println(Movie.movie4.getMovie_name());
				System.out.println(Movie.movie4.getMovie_price()+"€.");
				System.out.println();
			break;
			
			case 5:
				System.out.println(Movie.movie5.getMovie_name());
				System.out.println(Movie.movie5.getMovie_price()+"€.");
				System.out.println();
			break;
				
			}
		}else;
		
		
		
	}
	
	@SuppressWarnings("resource")
	static void menu() {
		Scanner start1=new Scanner(System.in);
		int start = 0;
		
		Scanner available1=new Scanner(System.in);
		int available;
		while(start !=3) {
			System.out.println("--- WELCOME ---");
			
			System.out.println("What would you like to do?");
			System.out.println(" 1. Check our products.");
			System.out.println(" 2. Search products by genre.");
			System.out.println(" 3. Convert from € to $.");
			System.out.println(" 4. Leave the shop.");
			
			start=start1.nextInt();
			
			switch (start) {
			
				
			case 1:
				System.out.println("These are our available products:");
				System.out.println("1. Books.");
				System.out.println("2. Movies.");
				available=available1.nextInt();
				
				if(available==1) {
					Book.books();
				}else;
				
				if(available==2) {
					Movie.movies();
				}else;
				
				break;
			case 2:
				Main.search();
				break;
				
			case 3: 
				Main.change();
				break;
				
			case 4:
				System.out.println("We hope to see you soon");
				
			default:
				System.out.println("Introduce a number between 1 and 3.");
				break;
				}
			}
	}
	
	
	}


