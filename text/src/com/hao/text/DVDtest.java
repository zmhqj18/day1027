package com.hao.text;

public class DVDtest {

	public static void main(String[] args) {
		   DVD dvd = new DVD(new DVDManager(new DVDDB()));
		   dvd.start();
	}
	

}
