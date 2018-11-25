# Improving ecommerce platform.
Improved the first project which consisted on creating an ecommerce platform with Java.

# How to start:

+ When you run the project you are required a username and a password to enter the shop. Username=qwerty Password=qwerty1234.


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

Most of the project is tested by the different classes such as UserTest and ProductTest.

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
