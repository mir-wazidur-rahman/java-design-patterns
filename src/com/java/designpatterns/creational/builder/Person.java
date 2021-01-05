package com.java.designpatterns.creational.builder;

public class Person {
	
	private final String name; //mandatory
	private final String email; //mandatory
	private final String address;
	private final String university;
	private final int age;
	
	public Person(Builder builder) {
		// TODO Auto-generated constructor stub
		this.name = builder.name;
		this.email = builder.email;
		this.address = builder.address;
		this.age = builder.age;
		this.university = builder.university;
	}

	

	public static class Builder {
		
		private final String name; 
		private final String email;
		private String address;
		private int age;
		private String university;
		
		public Builder(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public Builder setUniversity(String university) {
			this.university = university;
			return this;
		}

		
		public Person build() {
			return new Person(this);
		}
		
	}



	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", address=" + address + ", university=" + university
				+ ", age=" + age + "]";
	}
	
	

}
