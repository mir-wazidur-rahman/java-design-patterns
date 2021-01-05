package com.java.designpatterns.solid.dip;

public class OracleDatabase implements Database{

	@Override
	public void connect() {
		System.out.println("Connecting to Oracle DB...");
	}
	
	@Override
	public void disconnect() {
		System.out.println("Disconnecting Oracle DB....");
	}
}
