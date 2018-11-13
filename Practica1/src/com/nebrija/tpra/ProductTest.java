package com.nebrija.tpra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	//BOOK TESTS
	
	@Test
	void testGetNameBook() {
		Book book1 = new Book("The Lord of the Rings", 100, "Adventure", 20);
		assertEquals(book1.getBook_name(),"The Lord of the Rings");
	}
	
	@Test
	void testGetStockBook() {
		Book book1 = new Book("The Lord of the Rings", 100, "Adventure", 20);
		assertEquals(book1.getBook_stock(),100);
	}

	@Test
	void testGetGenreBook() {
		Book book1 = new Book("The Lord of the Rings", 100, "Adventure", 20);
		assertEquals(book1.getBook_genre(),"Adventure");
	}
	
	@Test
	void testGetPriceBook() {
		Book book1 = new Book("The Lord of the Rings", 100, "Adventure", 20);
		assertEquals(book1.getBook_price(),20);
	}
	
	//MOVIE TESTS
	
	@Test
	void testGetNameMovie() {
		Movie movie1=new Movie("Star Wars", 100, "Science-Fiction", 20);
		assertEquals(movie1.getMovie_name(),"Star Wars");
	}
	
	@Test
	void testGetStockMovie() {
		Movie movie1=new Movie("Star Wars", 100, "Science-Fiction", 20);
		assertEquals(movie1.getMovie_stock(),100);
	}
	
	@Test
	void testGetGenreMovie() {
		Movie movie1=new Movie("Star Wars", 100, "Science-Fiction", 20);
		assertEquals(movie1.getMovie_genre(),"Science-Fiction");
	}
	
	@Test
	void testGetPrice() {
		Movie movie1=new Movie("Star Wars", 100, "Science-Fiction", 20);
		assertEquals(movie1.getMovie_price(),20);
	}
}
