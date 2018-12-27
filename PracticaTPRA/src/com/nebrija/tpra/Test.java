package com.nebrija.tpra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

class Test {

	@org.junit.jupiter.api.Test
	
	void test() {
		
		//USER
		User user1 = new User("Alvaro", "alvaro@gmail.com", "qwerty");
		assertEquals(user1.getUsername(), "Alvaro");		
		assertEquals(user1.getEmail(), "alvaro@gmail.com");		
		assertEquals(user1.getPassword(), "qwerty");
		
		User.user1.setUsername("Alvaro");
		User.user1.setEmail("alvaro@gmail.com");
		User.user1.setPassword("qwerty");
		
		
		//MOVIES
		Movie movie1=new Movie("Star Wars", 100, "Science-Fiction", 20);
		assertEquals(movie1.getMovie_name(),"Star Wars");
		assertEquals(movie1.getMovie_stock(),100);
		assertEquals(movie1.getMovie_genre(),"Science-Fiction");
		assertEquals(movie1.getMovie_price(),20);
		
		Movie movie2 = new Movie(null, 0, null, 0);
		Movie.movie2.setMovie_name("The Shining");
		Movie.movie2.setMovie_genre("Horror");
		Movie.movie2.setMovie_stock(30);
		Movie.movie2.setMovie_price(25);
		
		Movie movie3=new Movie("Star Wars", 100, "Science-Fiction", 20);
		Movie movie4=new Movie("Star Wars", 100, "Science-Fiction", 20);
		Movie movie5=new Movie("Star Wars", 100, "Science-Fiction", 20);
		
		System.out.println(movie1.getMovie_name()+".");
		System.out.println(Translate.getString17()+" "+movie1.getMovie_genre());
		System.out.println(movie1.getMovie_stock()+" "+Translate.getString21());
		System.out.println(Translate.getString22()+" "+movie1.getMovie_price()+"€.");
		System.out.println();
		System.out.println(movie2.getMovie_name()+".");
		System.out.println(Translate.getString17()+" "+movie2.getMovie_genre());
		System.out.println(movie2.getMovie_stock()+" "+Translate.getString21());
		System.out.println(Translate.getString22()+" "+movie2.getMovie_price()+"€.");
		System.out.println();
		System.out.println(movie3.getMovie_name()+".");
		System.out.println(Translate.getString17()+" "+movie3.getMovie_genre());
		System.out.println(movie3.getMovie_stock()+" "+Translate.getString21());
		System.out.println(Translate.getString22()+" "+movie3.getMovie_price()+"€.");
		System.out.println();
		System.out.println(movie4.getMovie_name()+".");
		System.out.println(Translate.getString17()+" "+movie4.getMovie_genre());
		System.out.println(movie4.getMovie_stock()+" "+Translate.getString21());
		System.out.println(Translate.getString22()+" "+movie4.getMovie_price()+"€.");
		System.out.println();
		System.out.println(movie5.getMovie_name()+".");
		System.out.println(Translate.getString17()+" "+movie5.getMovie_genre());
		System.out.println(movie5.getMovie_stock()+" "+Translate.getString21());
		System.out.println(Translate.getString22()+" "+movie5.getMovie_price()+"€.");
		System.out.println();
		System.out.println(Translate.getString23());
		
		//BOOKS
		Book book1 = new Book("The Lord of the Rings", 100, "Adventure", 20);
		assertEquals(book1.getBook_name(),"The Lord of the Rings");
		assertEquals(book1.getBook_stock(),100);
		assertEquals(book1.getBook_genre(),"Adventure");
		assertEquals(book1.getBook_price(),20);
		
		Book book2 = new Book(null, 0, null, 0);
		Book.book2.setBook_name("The Da Vinci Code");
		Book.book2.setBook_genre("History");
		Book.book2.setBook_stock(100);
		Book.book2.setBook_price(30);
		
		Book book3 = new Book("The Lord of the Rings", 100, "Adventure", 20);
		Book book4 = new Book("The Lord of the Rings", 100, "Adventure", 20);
		Book book5 = new Book("The Lord of the Rings", 100, "Adventure", 20);
		
		System.out.println(book1.getBook_name()+".");
		System.out.println(Translate.getString17()+" "+book1.getBook_genre());
		System.out.println(book1.getBook_stock()+" "+Translate.getString21());
		System.out.println(Translate.getString22()+" "+book1.getBook_price()+"€.");
		System.out.println();
		System.out.println(book2.getBook_name()+".");
		System.out.println(Translate.getString17()+" "+book2.getBook_genre());
		System.out.println(book2.getBook_stock()+" "+Translate.getString21());
		System.out.println(Translate.getString22()+" "+book2.getBook_price()+"€.");
		System.out.println();
		System.out.println(book3.getBook_name()+".");
		System.out.println(Translate.getString17()+" "+book3.getBook_genre());
		System.out.println(book3.getBook_stock()+" "+Translate.getString21());
		System.out.println(Translate.getString22()+" "+book3.getBook_price()+"€.");
		System.out.println();
		System.out.println(book4.getBook_name()+"."); 
		System.out.println(Translate.getString17()+" "+book4.getBook_genre());
		System.out.println(book4.getBook_stock()+" "+Translate.getString21());
		System.out.println(Translate.getString22()+" "+book4.getBook_price()+"€.");
		System.out.println();
		System.out.println(book5.getBook_name()+".");
		System.out.println(Translate.getString17()+" "+book5.getBook_genre());
		System.out.println(book5.getBook_stock()+" "+Translate.getString21());
		System.out.println(Translate.getString22()+" "+book5.getBook_price()+"€.");
		System.out.println();
		System.out.println(Translate.getString23());
		
		//INTERNATIONALIZATION 
		Translate.translate();
		
		assertEquals(Translate.getString22(), "Precio");
		
		assertEquals(Translate.getString10(), "Libros");
		
		assertEquals(Translate.getString11(), "Peliculas");
		
		assertEquals(Translate.getString24(), "Cual?");

		assertEquals(Translate.getString30(), "Salvar al Soldado Ryan");
		
		assertEquals(Translate.getString37(), "Accion");
		
		assertEquals(Translate.getString32(), "Need for Speed");
		
		assertEquals(Translate.getString20(), "Aventura");
		
		assertEquals(Translate.getString14(), "Piensa en Java");
		
		assertEquals(Translate.getString1(), "Bienvenido");
		
		assertEquals(Translate.getString6(), "Salir de la tienda");

		assertEquals(Translate.getString29(), "El Resplandor");
		
		assertEquals(Translate.getString28(), "La Guerra de las Galaxias");
		
		assertEquals(Translate.getString18(), "Historia");
		
		//MAIN
		
	}

}



















