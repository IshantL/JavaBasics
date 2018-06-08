package com.practise.examples;
import java.util.Arrays;


public class ArrayReversal {

	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5, 6, 7}; reverse(numbers);

	

	}

	private static void reverse(int[] numbers) {
		System.out.println("Original Array: "+Arrays.toString(numbers));
		if(numbers == null || numbers.length==1)
			return;
		for(int i=0;i<numbers.length/2;i++) {
			int temp =  numbers[i];
			numbers[i] = numbers[numbers.length-1-i];
			numbers[numbers.length-1-i] = temp;
		}
		System.out.println("Reversed Array :"+Arrays.toString(numbers));
		
	}

}

/*
 * That's all about how to reverse array in place in Java. Time complexity of
 * this method is O(n/2) or O(n) because it only iterate through half of the
 * array, but its in O(n) because response time increases in same order as input
 * increases.
 */

