package com.java.designpatterns.solid.dip;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.javatuples.Triplet;

enum Relationship{
	PARENT,CHILD,SIBLING
}

class Person{
	public String name;

	public Person(String name) {
		this.name = name;
	}
}

interface RelationshipBrowser{
	List<Person> findAllChildrenof(String name);
}

class Relationships implements RelationshipBrowser{
	private List<Triplet<Person,Relationship, Person>> relations 
		= new ArrayList<>();
	
	public void addParentAndChild(Person parent, Person child) {
		relations.add(new Triplet<>(parent, Relationship.PARENT, child));
		relations.add(new Triplet<>(child, Relationship.CHILD, parent));
	}

	public List<Triplet<Person, Relationship, Person>> getRelations() {
		return relations;
	}

	//works with Java 9 and beyond
	@Override
	public List<Person> findAllChildrenof(String name) {
		// TODO Auto-generated method stub
//		return (relations.stream()
//				.filter(x -> Objects.equals(x.getValue0().name,name)
//						&& x.getValue1() == Relationship.PARENT)
//				.map(Triplet :: getValue2));
		
		return null;
	}

	
}

class Research{
	public Research(Relationships relationships) {
		List<Triplet<Person, Relationship, Person>> relations = relationships.getRelations();
		relations.stream()
			.filter(x -> x.getValue0().name.equals("John")
					&& x.getValue1() == Relationship.PARENT)
			.forEach(ch -> System.out.println(
					"John has a child called " + ch.getValue2().name));
			
	}
}

public class DependencyInversionPrinciple {
	
	public static void main(String[] args) {
		Person parent =  new Person("John");
		Person child1 = new Person("Chris");
		Person child2 = new Person("Matt");
		
		Relationships relationships = new Relationships();
		relationships.addParentAndChild(parent, child1);
		relationships.addParentAndChild(parent, child2);
		
		new Research(relationships);
	}

}
