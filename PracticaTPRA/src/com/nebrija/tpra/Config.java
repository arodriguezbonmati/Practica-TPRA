package com.nebrija.tpra;

import java.io.FileReader; 
import java.util.Properties;

public class Config {
	static void Print() {
		 try(FileReader reader =  new FileReader("config")) {
		        Properties properties = new Properties();
		        properties.load(reader);
		       
		        String userName = properties.getProperty("userName");
		        String password = properties.getProperty("password");
		        
		        System.out.println(userName);
		        System.out.println(password);

		       }catch (Exception e) {;
		       e.printStackTrace();
		       }
	}
}
