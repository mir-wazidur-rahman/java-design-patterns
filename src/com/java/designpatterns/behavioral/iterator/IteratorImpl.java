package com.java.designpatterns.behavioral.iterator;

interface Iterator {
	boolean hasNext();
	Object next();
}

class NameIterator implements Iterator{
	
	private String[] names;
	private int index;
	
	public NameIterator(String[] names) {
		super();
		this.names = names;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index < this.names.length;
	}
	
	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(hasNext()) 
			return this.names[index++];
		
		return null;
	}
}

class NameRepository{
	
	private String[] names = {"Mir","Wazid", "Rahman", "Neha", "Kumari"};
	
	public Iterator getIterator() {
		return new NameIterator(names);
	}
	
}
public class IteratorImpl {
	
	public static void main(String[] args) {
		
		NameRepository nameRepository = new NameRepository();
		
		for (Iterator itr = nameRepository.getIterator(); itr.hasNext() ; ) {
			String name = (String) itr.next();
			System.out.println(name);
		}
		
	}

	
}
