package com.practise.examples;
import java.util.Arrays;


public class ArrayContainsGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[]
	            {1,2,6,8, 3, 4, 5}
	           ;
		Arrays.sort(test);
		int numberToFind =7;
		int pos = Arrays.binarySearch(test, 4);
		if(pos >0) 
		System.out.println("Element found is:"+pos);
		else 
			System.out.println("element not found");
		
		
		

		
	}

}

/*
 * Another interesting array problem, because array doesn't provide any built-in
 * method to check if any number exists or not. This problem is essentially how
 * to search an element in the array. There are two options sequential search or
 * binary search. You should ask the interviewer about whether an array is
 * sorted or not, if the array is sorted then you can use binary search to check
 * if given number is present in an array or not. The complexity of binary
 * search is O(logN). BTW, if interviewer says that array is not sorted then you
 * can still sort and perform binary search otherwise you can use sequential
 * search. Time complexity of sequential search in array is O(n).
 */

