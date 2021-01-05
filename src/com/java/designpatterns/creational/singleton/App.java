package com.java.designpatterns.creational.singleton;

public class App {
	
	public static void main(String[] args) {
		SingletonImplBetter.INSTANCE.setCounter(10);
		
		System.out.println(SingletonImplBetter.INSTANCE.getCounter());
	}

}
