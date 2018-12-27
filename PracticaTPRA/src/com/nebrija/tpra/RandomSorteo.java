package com.nebrija.tpra;

import java.util.Random;

public class RandomSorteo {
	  
	     static Random randomno = new Random();
		 static boolean value = randomno.nextBoolean();
		 
		 protected static boolean isValue() {
			return value;
		 }
		 protected static void setValue(boolean value) {
			RandomSorteo.value = value;
		 }
		 	 
}
