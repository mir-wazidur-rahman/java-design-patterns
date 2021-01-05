package com.java.designpatterns.behavioral.template;

import java.util.Arrays;

abstract class Algorithm{
	public abstract void initialize();
	public abstract void sorting();
	public abstract void printResult();
	
	public void sort() {
		initialize();
		sorting();
		printResult();
	}
}

class BubbleSort extends Algorithm{
	
	private int[] numbers;
	
	public BubbleSort(int[] numbers) {
		// TODO Auto-generated constructor stub
		this.numbers = numbers;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Initializing bubble sort....");
	}

	@Override
	public void sorting() {
		// TODO Auto-generated method stub
		for (int firstIndex=0;firstIndex < numbers.length ; firstIndex++){
            for (int nextIndex=firstIndex;nextIndex>0;nextIndex--){
                if (numbers[nextIndex] < numbers[nextIndex-1]) swap(numbers,nextIndex,nextIndex-1);
            }
        }
	}

	private void swap(int[] array, int i, int j) {
		// TODO Auto-generated method stub
		 if (i == j) return;

	        int temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	}

	@Override
	public void printResult() {
		// TODO Auto-generated method stub
		
//		for(int i : numbers) System.out.println(i + " ");
		Arrays.stream(numbers).forEach(a -> System.out.print(a + " "));
		
	}
}
public class TemplatePatternImpl {

	public static void main(String[] args) {
		
		int[] numbers = {20, 35, -15, 7, 55, 1, -22} ;
		Algorithm bubsort = new BubbleSort(numbers);
		bubsort.sort();
		System.out.println();
		Algorithm insertionSort = new InsertionSort(numbers);
		insertionSort.sort();
	}
}
