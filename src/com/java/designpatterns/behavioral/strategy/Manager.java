package com.java.designpatterns.behavioral.strategy;

public class Manager implements Strategy{
	
	private Strategy strategy;
	
	public void setstrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	@Override
	public void operation(int num1, int num2) {
		// TODO Auto-generated method stub
		this.strategy.operation(num1, num2);
		
	}
	
	
	public static void main(String[] args) {
		
		Manager manager = new Manager();
		manager.setstrategy(new Multiply());
		manager.operation(2, 5);
	}

}
