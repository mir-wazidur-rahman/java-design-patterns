package com.java.designpatterns.solid.dip;

public class DataBaseHandler {
	
	private Database database;
	
	public DataBaseHandler(Database database) {
		this.database = database;
	}
	
	public void connect() {
		this.database.connect();
	}
	
	public void disconnect() {
		this.database.disconnect();
	}

}
