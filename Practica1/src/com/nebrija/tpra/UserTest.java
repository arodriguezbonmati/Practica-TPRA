package com.nebrija.tpra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void testGetEmail() {
		User user1 = new User("qwerty@gmail.com", "qwerty", "qwerty1234");
		assertEquals(user1.getemail(), "qwerty@gmail.com");
	}
	
	@Test
	void testGetUsername() {
		User user1 = new User("qwerty@gmail.com", "qwerty", "qwerty1234");
		assertEquals(user1.getusername(), "qwerty");
	}
	
	@Test
	void testGetPassword() {
		User user1 = new User("qwerty@gmail.com", "qwerty", "qwerty1234");
		assertEquals(user1.getpassword(), "qwerty1234");
	}

}
