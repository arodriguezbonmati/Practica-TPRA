[![Codacy Badge](https://api.codacy.com/project/badge/Grade/2e09dc1efa5049719338b24083c388af)](https://www.codacy.com/app/varorb99/Prueba2?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=varorb99/Prueba2&amp;utm_campaign=Badge_Grade)

-----------------------------------
# Improving ecommerce platform.
Improved the project which consisted on creating an ecommerce platform with Java.

# Important:

+ To run the project in the console download the file named PracticaTPRA.
+ To run the project with graphic interfaces download the file named PracticaTPRA-Interfaces

# How to start:

When you run the project you are required a username an email and a password:

+ Username: Alvaro
+ Email: alvaro@gmail.com
+ Password: qwerty


# Main menu
 ```
--- WELCOME ---
What would you like to do?
 1. Check our products.
 2. Search products by genre.
 3. Convert from € to $.
 4. Leave the shop.
```

+ The first option lets you see all the products available classified by category, here you can also buy products.

+ The second option enables you to browse the book and movie genres and choose from there.

+ The third option is for converting currency from € to $.

+ The last option is used to leave the shop.

# Testing

Most of the project is tested by the different classes such as UserTest, ProductTest and InternationalizationTest.

Example of the Username testing.

 ```
class UserTest {

	@Test
	void testGetEmail() {
		User user1 = new User("Alvaro", "alvaro@gmail.com", "qwerty");
		assertEquals(user1.getUsername(), "Alvaro");
	}
	
```

# Handling Exceptions

There is also a Custom Exception made for the identification process in case it fails. For instance, this is the method that throws the exception when you enter the wrong username.

```
public void validateI(String i) throws MyException{
		if(!i.equals("Alvaro")) {
			throw new MyException("Incorrect user");
		}
	}
```

# Internationalization

The project is fully functional in English, Spanish and German.
```
Choose a language
1. Español
2. English
3. Deutsch
```

# Design patterns + Interface

Implemented Proxy Design Pattern and Interface.
This Design Patterns implements a raffle where, by buying a book, you enter a draw where you can get a 1€ discount on all books.
