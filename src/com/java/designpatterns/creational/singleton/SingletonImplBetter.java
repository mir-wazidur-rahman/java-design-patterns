package com.java.designpatterns.creational.singleton;

public enum SingletonImplBetter {
	
	INSTANCE;
	
	private int counter;
	
	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public int getCounter() {
		return this.counter;
	}

}