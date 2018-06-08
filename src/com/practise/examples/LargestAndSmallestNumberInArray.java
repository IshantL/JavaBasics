package com.practise.examples;
import java.util.Arrays;


public class LargestAndSmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = new int[]
	            {1,2,6,8, 3, 4, 5}
	           ;
		
		Arrays.sort(test);
		
		int smallest = test[0];
		int largest = test[test.length-1];
				System.out.println(smallest +" "+largest);
	}
	
	/*
	 * This is a rather simple array interview question. You have given an
	 * unsorted integer array and you need to find the largest and smallest
	 * element in the array. Of course, you can sort the array and then pick the
	 * top and bottom element but that would cost you O(NLogN) because of
	 * sorting, getting element in array with index is O(1) operation.
	 */

	

}
