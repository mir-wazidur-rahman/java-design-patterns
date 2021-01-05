package com.java.designpatterns.structural.facade;
 
interface Algorithm {
	void sort();
}

class BubbleSort implements Algorithm{
	
	@Override
	public void sort() {
		// TODO Auto-generated method stub
		System.out.println("Using Bubble sort..");
	} 
}

class MergeSort implements Algorithm{

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		System.out.println("Using Merge sort..");
	} 
	
}

class QuickSort implements Algorithm{

	@Override
	public void sort() {
		// TODO Auto-generated method stub
		System.out.println("Using Quick sort..");
	} 
	
}

class SortingManager {
	
	private Algorithm bubbsort;
	private Algorithm mergesort;
	private Algorithm quicksort;
	
	public SortingManager() {
		this.bubbsort = new BubbleSort();
		this.mergesort = new MergeSort();
		this.quicksort = new QuickSort();
	}
	
	public void doBubbleSort() {
		this.bubbsort.sort();
	}
	
	public void doMergeSort() {
		this.mergesort.sort();
	}
	
	public void doQuickSort() {
		this.quicksort.sort();
	}
}

public class FacadeImpl {
	
	public static void main(String[] args) {
		SortingManager manager = new SortingManager();
		manager.doQuickSort();
	}

}
