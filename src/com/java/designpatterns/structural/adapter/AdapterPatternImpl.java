package com.java.designpatterns.structural.adapter;

interface Vehicle {
	void accelerate();
}

class Car implements Vehicle{
	
	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Car is accelerating");
	} 
}

class Bus implements Vehicle{

	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		System.out.println("Bus is accelerating");
	} 
	
	
}

class Bicycle {
	
	public void go() {
		System.out.println("Using bicycle");
	}
}

class BicycleAdapter implements Vehicle {

	private Bicycle bicycle;
	
	
	public BicycleAdapter(Bicycle bicycle) {
		super();
		this.bicycle = bicycle;
	}


	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		this.bicycle.go();
	} 
	
}
public class AdapterPatternImpl {
	
	public static void main(String[] args) {
		Vehicle bus = new Bus();
		Vehicle car = new Car();
		Vehicle biCycle = new BicycleAdapter(new Bicycle());
		
		bus.accelerate();
		biCycle.accelerate();
	}
	
	

}
