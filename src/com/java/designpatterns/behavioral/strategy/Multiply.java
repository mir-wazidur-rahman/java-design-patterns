package com.java.designpatterns.behavioral.strategy;

public class Multiply implements Strategy{

	@Override
	public void operation(int num1, int num2) {
		// TODO Auto-generated method stub
		
		System.out.println( num1 * num2);
		
	}

}
