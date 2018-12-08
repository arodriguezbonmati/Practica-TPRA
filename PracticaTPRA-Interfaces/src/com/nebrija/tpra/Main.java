package com.nebrija.tpra;

import java.util.Scanner;


public class Main {
	
	/*public static void main(String[] args) {
		User.LogIn();
		
	}*/
	
	@SuppressWarnings("resource")
	public static void international() {
		
		
		String g = "";
	    String t = "";
	    
	    @SuppressWarnings("resource")
		Scanner idiom = new Scanner(System.in);
	    int idioma = 0;
	    System.out.println("Choose a language");
	    System.out.println("1. Español");
	    System.out.println("2. English");
	    System.out.println("3. Deutsch");
	    idioma = idiom.nextInt();
	    
	    if(idioma==1) {
	    	g = "es";
			t = "ES"; 
	    }
	    if(idioma==2) {
	    	g = "en";
			t = "EN"; 
	    }
	    if(idioma==3) {
	    	g = "al";
			t = "AL"; 
	    }
	    
	    if(idioma !=1 && idioma !=2 && idioma !=3) {
	    	System.out.println("Introduce a number between 1 and 3");
	    }
	    
	    Translate.setCountry(t);
		Translate.setLanguage(g);
		
		Translate.translate();
		
		System.out.println(Translate.getString1());
		System.out.println(Translate.getString2());
		System.out.println("1. "+Translate.getString3());
		System.out.println("2. "+Translate.getString4());
		System.out.println("3. "+Translate.getString5());
		System.out.println("4. "+Translate.getString6());
		
		
		
		Scanner elige1 = new Scanner(System.in);
	    int elige = 0;
	    elige = elige1.nextInt();
	    
	    switch(elige) {
	    case 1:
	    	System.out.println(Translate.getString9());
			System.out.println("1. "+ Translate.getString10());
			System.out.println("2. "+ Translate.getString11());
			Scanner available1=new Scanner(System.in);
			int available;
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
	    	System.out.println(Translate.getString7());
	    	break;
	    	
	    default:
	    	System.out.println(Translate.getString8());
	    }
	    
	    
	}
	
	
	@SuppressWarnings("resource")
	static void change() {
		
		Scanner answer1=new Scanner(System.in);
 		int answer=0;
 		
 		Scanner price1=new Scanner(System.in);
        double price = 0;
        
        System.out.println(Translate.getString26());
		 price = price1.nextInt();
		 
		 System.out.println(Translate.getString27());
		 answer=answer1.nextInt();
		 
		if(answer==1) {
			double price2 = 0;
			 price2 = price * 1.15;
			 System.out.println(price+"€ equals to "+price2+"$.");
			 System.out.println("");
			 Main.international();
		}else {
			Main.international();
		}
		
		 }
	
	
	@SuppressWarnings("resource")
	static void search() {
		Scanner s1=new Scanner(System.in);
		int s=0;
		System.out.println("1. "+ Translate.getString10());
		System.out.println("2. "+ Translate.getString11());
		Scanner search1=new Scanner(System.in);
		int search=0;
		search=search1.nextInt();
		if(search==1) {
			System.out.println(Translate.getString10());
			System.out.println("	1. "+Translate.getString20());
			System.out.println("	2. "+Translate.getString19());
			System.out.println("	3. "+Translate.getString18());

			
			s=s1.nextInt();
			
			switch(s) {
			case 1: 
				System.out.println(Book.book1.getBook_name());
				System.out.println(Book.book1.getBook_price()+"€.");
				System.out.println();
				System.out.println(Book.book2.getBook_name());
				System.out.println(Book.book2.getBook_price()+"€.");
				System.out.println();
				System.out.println(Book.book5.getBook_name());
				System.out.println(Book.book5.getBook_price()+"€.");
				System.out.println();
				Main.international();
			break;
			
			case 2:
				System.out.println(Book.book3.getBook_name());
				System.out.println(Book.book3.getBook_price()+"€.");
				System.out.println();
				Main.international();
			break;
			
			case 3:
				System.out.println(Book.book2.getBook_name());
				System.out.println(Book.book2.getBook_price()+"€.");
				System.out.println();
				Main.international();
			}
			
		}else;
		
		if(search==2) {
			Scanner sa1=new Scanner(System.in);
			int sa=0;
			System.out.println(Translate.getString11());
			System.out.println("	1. "+Translate.getString33());
			System.out.println("	2. "+Translate.getString34());
			System.out.println("	3. "+Translate.getString35());
			System.out.println("	4. "+Translate.getString36());
			System.out.println("	5. "+Translate.getString37());
			
			
			sa=sa1.nextInt();
			
			switch(sa) {
			case 1:
				System.out.println(Translate.getString28());
				System.out.println(Movie.movie1.getMovie_price()+"€.");
				System.out.println();
				Main.international();
			break;
			
			case 2:
				System.out.println(Translate.getString29());
				System.out.println(Movie.movie2.getMovie_price()+"€.");
				System.out.println();
				Main.international();
			break;
			
			case 3:
				System.out.println(Translate.getString30());
				System.out.println(Movie.movie3.getMovie_price()+"€.");
				System.out.println();
				Main.international();
			break;
			
			case 4:
				System.out.println(Translate.getString31());
				System.out.println(Movie.movie4.getMovie_price()+"€.");
				System.out.println();
				Main.international();
			break;
			
			case 5:
				System.out.println(Translate.getString32());
				System.out.println(Movie.movie5.getMovie_price()+"€.");
				System.out.println();
				Main.international();
			break;
				
			}
		}else;
		
		
		
	}
	
	}


