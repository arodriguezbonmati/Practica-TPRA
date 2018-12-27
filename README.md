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
 This is how the Main Menu looks like:
 
 ![menu](https://user-images.githubusercontent.com/43890020/50490772-3c105000-0a0f-11e9-8c87-5a68494d4aaf.png)

# Testing

Most of the project is tested using the Eclipse extension called Eclemma. At first, I only had around a 12% of the project tested, but now, using Eclemma, I managed to boost the testing percentage to almost 40%.

+ Before

![tests antes](https://user-images.githubusercontent.com/43890020/50490582-1fbfe380-0a0e-11e9-9191-bd17a52a376f.png)

+ After

![tests despues](https://user-images.githubusercontent.com/43890020/50490692-b9879080-0a0e-11e9-97a5-80fa3fba61d0.png)


# Internationalization

The project is fully functional in English, Spanish and German. It comes by default in English, but you can change it to Spanish or German whenever you want.

![internacional](https://user-images.githubusercontent.com/43890020/50490873-b3de7a80-0a0f-11e9-8b55-4b6fd3c3a572.png)


# Handling Exceptions

There is also a Custom Exception made for the identification process in case it fails. For instance, this is the method that throws the exception when you enter the wrong username.

```
public void validateI(String i) throws MyException{
		if(!i.equals("Alvaro")) {
			throw new MyException("Incorrect user");
		}
	}
```

# Design patterns + Interface

Implemented Proxy Design Pattern and Interface.
This Design Patterns implements a raffle where, by buying a book, you enter a draw where you can get a 1€ discount on all books.
