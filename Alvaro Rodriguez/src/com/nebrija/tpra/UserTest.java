package com.nebrija.tpra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void testGetEmail() {
		User user1 = new User("Alvaro", "alvaro@gmail.com", "qwerty");
		assertEquals(user1.getUsername(), "Alvaro");
	}
	
	@Test
	void testGetUsername() {
		User user1 = new User("Alvaro", "alvaro@gmail.com", "qwerty");
		assertEquals(user1.getEmail(), "alvaro@gmail.com");
	}
	
	@Test
	void testGetPassword() {
		User user1 = new User("Alvaro", "alvaro@gmail.com", "qwerty");
		assertEquals(user1.getPassword(), "qwerty");
	}

}
