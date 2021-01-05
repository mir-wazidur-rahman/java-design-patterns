package com.java.designpatterns.solid.isp;

class Document{
	
}

interface Machine{
	
	void print(Document d);
	void fax(Document d);
	void scan(Document d);
	
}

class MultiFunctionalPrinter implements Machine{

	@Override
	public void print(Document d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fax(Document d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan(Document d) {
		// TODO Auto-generated method stub
		
	}
	
}

class OldFashionPrinter implements Machine{

	@Override
	public void print(Document d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fax(Document d) {
		// TODO Auto-generated method stub
	}

	@Override
	public void scan(Document d) {
		// TODO Auto-generated method stub
	}
	
}

interface Printer{
	void print(Document d);
}

interface Scanner{
	void scan(Document d);
}

class JustAPrinter implements Printer{

	@Override
	public void print(Document d) {
		// TODO Auto-generated method stub
		System.out.println("Printing documents");
	}
	
}

class PhotoCopier implements Printer,Scanner{

	@Override
	public void scan(Document d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print(Document d) {
		// TODO Auto-generated method stub
		
	}
	
}

interface MultiFunctionDevice extends Printer, Scanner{};

class MultiFunctionMachine implements MultiFunctionDevice{

	@Override
	public void print(Document d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scan(Document d) {
		// TODO Auto-generated method stub
		
	}
	
}

public class InterfaceDesignPrinciple {

}
