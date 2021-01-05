package com.java.designpatterns.creational.builder;

public class BuilderImpl {
	
	public static void main(String[] args) {
		Person person = new Person.Builder("Mir","mir.wazid.rahman@gmail.com").setAge(15).setAddress("Munich").build();
		
		System.out.println(person);
	}
	

}
