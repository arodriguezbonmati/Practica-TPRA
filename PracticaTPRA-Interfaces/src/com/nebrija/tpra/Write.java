package com.nebrija.tpra;

import java.io.FileWriter;

public class Write {
	
	public synchronized void print() {
	try {
		FileWriter write = new FileWriter("Bought.txt",true);
		write.write("\n");
		write.write("Product: El Señor de los Anillos");
		write.close();
	}catch(Exception e) {
	}
	notify();
	}

}
