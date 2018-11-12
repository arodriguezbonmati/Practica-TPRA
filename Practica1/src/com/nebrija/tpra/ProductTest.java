package com.nebrija.tpra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductTest {

	@Test
	void testGetStock() {
		Book book1 = new Book("The Lord of the Rings", 100, "Adventure", 20);
		assertEquals(book1.getBook_stock(),100);
	}

	@Test
	void testGetGenre() {
		Book book1 = new Book("The Lord of the Rings", 100, "Adventure", 20);
		assertEquals(book1.getBook_genre(),"Adventure");
	}
	
	@Test
	void testGetPrice() {
		Movie movie1=new Movie("Star Wars", 100, "Science-Fiction", 20);
		assertEquals(movie1.getMovie_price(),20);
	}
}
