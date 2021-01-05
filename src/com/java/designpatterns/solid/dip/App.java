package com.java.designpatterns.solid.dip;

public class App {
	
	public static void main(String[] args) {
		DataBaseHandler dbHandler = new DataBaseHandler(new OracleDatabase());
		
		dbHandler.connect();
		dbHandler.disconnect();
	}

}
