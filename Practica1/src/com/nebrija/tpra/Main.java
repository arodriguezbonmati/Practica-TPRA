package com.nebrija.tpra;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		User.LogIn();
		
	}
	@SuppressWarnings("resource")
	void change() {
		
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
	
	static void menu() {
		Scanner start1=new Scanner(System.in);
		int start = 0;
		
		Scanner available1=new Scanner(System.in);
		int available;
		while(start !=3) {
			System.out.println("--- WELCOME ---");
			
			System.out.println("What would you like to do?");
			System.out.println(" 1. Check our products.");
			System.out.println(" 2. Convert currency from € to $.");
			System.out.println(" 3. Leave the shop.");
			
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
				Main convert = new Main();
				convert.change();
				break;
				
			case 3: 
				System.out.println("Thank you, we hope to see you soon.");
				break;
				
			default:
				System.out.println("Introduce a number between 1 and 3.");
				break;
				}
			}
	}
	static void menuEspañol() {
		Scanner start1=new Scanner(System.in);
		int start = 0;
		
		Scanner available1=new Scanner(System.in);
		int available;
		while(start !=3) {
			System.out.println("---Bienvenido---");
			
			System.out.println("¿Qué quieres hacer?");
			System.out.println(" 1. Ver productos.");
			System.out.println(" 2. Convertir de € a $.");
			System.out.println(" 3. Salir.");
			
			start=start1.nextInt();
			
			switch (start) {
			
				
			case 1:
				System.out.println("Estos son los productos que están disponibles: ");
				System.out.println("1. Libros.");
				System.out.println("2. Películas.");
				available=available1.nextInt();
				
				if(available==1) {
					Book.books();
				}else;
				
				if(available==2) {
					Movie.movies();
				}else;
				
				break;
			case 2:
				Main convert = new Main();
				convert.change();
				break;
				
			case 3: 
				System.out.println("Gracias, esperamos verle pronto.");
				break;
				
			default:
				System.out.println("Introduce un numero entre 1 y 3.");
				break;
				}
			}
	}
	
	
	}


