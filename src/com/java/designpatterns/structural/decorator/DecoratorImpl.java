package com.java.designpatterns.structural.decorator;


interface Beverage{
	int getCost();
	String getDescription();
}

abstract class BeverageDecorator implements Beverage {
	
	protected Beverage beverage;
	
	
	public BeverageDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}


	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost();
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription();
	}
}

class Milk extends BeverageDecorator {

	public Milk(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost() + 3;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " Milk";
	}
	
}

class PlainBeverage implements Beverage {
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return 5;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Plain beverage";
	}
	
}

class Sugar extends BeverageDecorator {
	
	private Beverage beverage;

	public Sugar(Beverage beverage) {
		super(beverage);
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost() + 1;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + " Sugar";
	}
	
}
public class DecoratorImpl {

	public static void main(String[] args) {
		Beverage b = new Sugar(new Sugar(new Milk(new PlainBeverage())));
		
		System.out.println(b.getCost());
		System.out.println(b.getDescription());
	}
}
