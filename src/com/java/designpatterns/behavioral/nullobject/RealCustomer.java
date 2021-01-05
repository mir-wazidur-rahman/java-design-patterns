package com.java.designpatterns.behavioral.nullobject;

public class RealCustomer extends AbstractCustomer{

	private String customerName;
	
	public RealCustomer(String customerName) {
		super();
		this.customerName = customerName;
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getCustomer() {
		// TODO Auto-generated method stub
		return this.customerName;
	}

}
