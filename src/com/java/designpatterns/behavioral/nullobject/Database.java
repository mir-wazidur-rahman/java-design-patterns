package com.java.designpatterns.behavioral.nullobject;

import java.util.ArrayList;
import java.util.List;

public class Database {

	private List<String> customerNames;
	
	public Database() {
		this.customerNames = new ArrayList<>();
		this.customerNames.add("Mir");
		this.customerNames.add("Wazidur");
		this.customerNames.add("Rahman");
		this.customerNames.add("Neha");
		this.customerNames.add("Kumari");
		
	}
	
	public boolean existsCustomer(String name) {
		
		return customerNames.contains(name);
	}
}
