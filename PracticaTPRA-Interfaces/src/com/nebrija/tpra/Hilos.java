package com.nebrija.tpra;

public class Hilos extends Thread {

	@Override
	public void run() {
		Write qw = new Write();
		qw.print();
	}
}