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
    static String string9;
    static String string10;
    static String string11;
    static String string12;
    static String string13;
    static String string14;
    static String string15;
    static String string16;
    static String string17;
    static String string18;
    static String string19;
    static String string20;
    static String string21;
    static String string22;
    static String string23;
    static String string24;
    static String string25;
    static String string26;
    static String string27;
    static String string28;
    static String string29;
    static String string30;
    static String string31;
    static String string32;
    static String string33;
    static String string34;
    static String string35;
    static String string36;
    static String string37;
    static String string38;
    static String string39;
    static String string40;
    static String string41;
    static String string42;
    static String string43;
    static String string44;
    static String string45;
    static String string46;
    static String string47;
    static String string48;
    static String string49;
    static String string50;
    static String string51;
    static String string52;
    
    
    
    /*static String stringexit;*/
    
    
	public static void translate() {
		Locale currentLocale;
        ResourceBundle messages;
        
        currentLocale = new Locale(language, country);
        messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
        
        string1 = messages.getString("Welcome");
        string2 = messages.getString("Do");
        string3 = messages.getString("Products");
        string4 = messages.getString("Gen");
        string5 = messages.getString("Euros");
        string6 = messages.getString("Leave");
        string7 = messages.getString("Hope");
        string8 = messages.getString("Number");
        string9 = messages.getString("Available");
        string10 = messages.getString("Books");
        string11 = messages.getString("Movies");
        string12 = messages.getString("Lord");
        string13 = messages.getString("Vinci");
        string14 = messages.getString("Java");
        string15 = messages.getString("Hobbit");
        string16 = messages.getString("Sawyer");
        string17 = messages.getString("G");
        string18 = messages.getString("History");
        string19 = messages.getString("Science");
        string20 = messages.getString("Adventure");
        string21 = messages.getString("Units");
        string22 = messages.getString("Price");
        string23 = messages.getString("Buy");
        string24 = messages.getString("Which");
        string25 = messages.getString("Purchased");
        string26 = messages.getString("Enter");
        string27 = messages.getString("Convert");
        string28 = messages.getString("Star");
        string29 = messages.getString("Shining");
        string30 = messages.getString("Ryan");
        string31 = messages.getString("Story");
        string32 = messages.getString("Speed");
        string33 = messages.getString("Fiction");
        string34 = messages.getString("Horror");
        string35 = messages.getString("War");
        string36 = messages.getString("Entertainment");
        string37 = messages.getString("Action");
        string38 = messages.getString("realsurprise");
        string39 = messages.getString("proxysurprise");
        string40 = messages.getString("Iniciarsesion");
        string41 = messages.getString("Usuario");
        string42 = messages.getString("Email");
        string43 = messages.getString("Contraseña");
        string44 = messages.getString("Entrar");
        string45 = messages.getString("MainMenu");
        string46 = messages.getString("productsButton");
        string47 = messages.getString("converterButton");
        string48 = messages.getString("availableProducts");
        string49 = messages.getString("Exit");
        string50 = messages.getString("availableBooks");
        string51 = messages.getString("availableMovies");
        string52 = messages.getString("select1");
        
        
        
        

        
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

	protected static String getLanguage() {
		return language;
	}

	protected static String getCountry() {
		return country;
	}

	protected static String getString9() {
		return string9;
	}

	protected static String getString10() {
		return string10;
	}

	protected static String getString11() {
		return string11;
	}

	protected static String getString12() {
		return string12;
	}

	protected static String getString13() {
		return string13;
	}

	protected static String getString14() {
		return string14;
	}

	protected static String getString15() {
		return string15;
	}

	protected static String getString16() {
		return string16;
	}

	protected static String getString17() {
		return string17;
	}

	protected static String getString18() {
		return string18;
	}

	protected static String getString19() {
		return string19;
	}

	protected static String getString20() {
		return string20;
	}

	protected static String getString21() {
		return string21;
	}

	protected static String getString22() {
		return string22;
	}

	protected static String getString23() {
		return string23;
	}

	protected static String getString24() {
		return string24;
	}

	protected static String getString25() {
		return string25;
	}

	protected static String getString26() {
		return string26;
	}

	protected static String getString27() {
		return string27;
	}

	protected static String getString28() {
		return string28;
	}

	protected static String getString29() {
		return string29;
	}

	protected static String getString30() {
		return string30;
	}

	protected static String getString31() {
		return string31;
	}

	protected static String getString32() {
		return string32;
	}

	protected static String getString33() {
		return string33;
	}

	protected static String getString34() {
		return string34;
	}

	protected static String getString35() {
		return string35;
	}

	protected static String getString36() {
		return string36;
	}

	protected static String getString37() {
		return string37;
	}

	protected static String getString38() {
		return string38;
	}

	protected static String getString39() {
		return string39;
	}

	protected static void setLanguage(String language ) {
		Translate.language = language;
	}

	protected static void setCountry(String country) {
		Translate.country = country;
	}

	protected static String getString40() {
		return string40;
	}

	protected static String getString41() {
		return string41;
	}

	protected static String getString42() {
		return string42;
	}

	protected static String getString43() {
		return string43;
	}

	protected static String getString44() {
		return string44;
	}

	protected static String getString45() {
		return string45;
	}

	protected static String getString46() {
		return string46;
	}

	protected static String getString47() {
		return string47;
	}

	protected static String getString48() {
		return string48;
	}

	protected static String getString49() {
		return string49;
	}

	protected static String getString50() {
		return string50;
	}

	protected static String getString51() {
		return string51;
	}

	protected static String getString52() {
		return string52;
	}
}
