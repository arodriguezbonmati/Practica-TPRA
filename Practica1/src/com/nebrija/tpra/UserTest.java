package com.nebrija.tpra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void testGetEmail() {
		User user1 = new User("qwerty@gmail.com", "qwerty", "qwerty1234");
		assertEquals(user1.getEmail(), "qwerty@gmail.com");
	}
	
	@Test
	void testGetUsername() {
		User user1 = new User("qwerty@gmail.com", "qwerty", "qwerty1234");
		assertEquals(user1.getUsername(), "qwerty");
	}
	
	@Test
	void testGetPassword() {
		User user1 = new User("qwerty@gmail.com", "qwerty", "qwerty1234");
		assertEquals(user1.getPassword(), "qwerty1234");
	}

}
