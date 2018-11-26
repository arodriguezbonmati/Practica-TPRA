package com.nebrija.tpra;

import java.util.Locale;
import java.util.ResourceBundle;

public class Translate {

	static String language = System.getProperty("user.country");
    static String country = System.getProperty("user.language");
    
    static String string1;
    static String string2;
    static String string3;
    static String string4;
    static String string5;
    static String string6;
    static String string7;
    static String string8;
    static String stringexit;
    
    
	public static void translate() {
		Locale currentLocale;
        ResourceBundle messages;
        
        currentLocale = new Locale(language, country);
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        
        string1 = messages.getString("Welcome");
        string2 = messages.getString("Do");
        string3 = messages.getString("Products");
        string4 = messages.getString("Genre");
        string5 = messages.getString("Euros");
        string6 = messages.getString("Leave");
        string7 = messages.getString("Hope");
        string8 = messages.getString("Number");

        
       }

    protected static String getString1() {
		return string1;
	}

	protected static String getString2() {
		return string2;
	}

	protected static String getString3() {
		return string3;
	}

	protected static String getString4() {
		return string4;
	}

	protected static String getString5() {
		return string5;
	}

	protected static String getString6() {
		return string6;
	}

	protected static String getString7() {
		return string7;
	}

	protected static String getString8() {
		return string8;
	}

	protected static String getStringexit() {
		return stringexit;
	}

	protected static void setLanguage(String language ) {
		Translate.language = language;
	}

	protected static void setCountry(String country) {
		Translate.country = country;
	}
}
