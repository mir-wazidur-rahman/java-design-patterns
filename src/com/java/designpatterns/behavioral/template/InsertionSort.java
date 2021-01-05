package com.java.designpatterns.behavioral.template;

import java.util.Arrays;

public class InsertionSort extends Algorithm {

	private int[] numbers;
	
	public InsertionSort(int[] numbers) {
		super();
		this.numbers = numbers;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Initializing insertion sort....");
	}

	@Override
	public void sorting() {
		// TODO Auto-generated method stub
		for (int firstUnsortedIndex=1 ; firstUnsortedIndex < numbers.length ; firstUnsortedIndex++){
            int newElement = numbers[firstUnsortedIndex];


            int i;

            for (i = firstUnsortedIndex ; i > 0 && numbers [i - 1] > newElement;  i--) numbers[i] = numbers[i - 1];

            numbers[i] = newElement;

        }

	}

	@Override
	public void printResult() {
		// TODO Auto-generated method stub
		Arrays.stream(numbers).forEach(a -> System.out.print(a + " "));
	}

}
