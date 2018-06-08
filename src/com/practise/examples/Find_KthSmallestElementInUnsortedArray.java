package com.practise.examples;
import java.util.Arrays;


public class Find_KthSmallestElementInUnsortedArray {

	public static void main(String[] args) {
		Integer arr[] = new Integer[]{12, 3, 5, 7, 19};
        int k = 2;
        System.out.print( "K'th smallest element is "+
                            kthSmallest(arr, k) ); 

	}

	private static int kthSmallest(Integer[] arr, int k) {
		Arrays.sort(arr);
		
		return arr[k-1];
	}

	
	/*
	 * One way to solve this problem is to sort the array in ascending order
	 * then pick the k-1th element, that would be your kth smallest number in
	 * array because array index starts at zero,
	 */ 

	// Time complexity = O(nLogn)
}
