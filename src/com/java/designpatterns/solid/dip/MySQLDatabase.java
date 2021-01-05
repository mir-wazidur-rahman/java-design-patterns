package com.java.designpatterns.solid.dip;

public class MySQLDatabase implements Database {
	
	@Override
	public void connect() {
		System.out.println("Connecting to MySQL DB...");
	}
	
	@Override
	public void disconnect() {
		System.out.println("Disconnecting MySQL Db");
	}

}
