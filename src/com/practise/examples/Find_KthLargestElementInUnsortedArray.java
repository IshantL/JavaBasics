package com.practise.examples;
import java.util.Arrays;
import java.util.Collections;


public class Find_KthLargestElementInUnsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = new Integer[]{12, 3, 5, 7, 19};
        int k = 2;
        System.out.print( "K'th largest element is "+
                            kthLargest(arr, k) ); 
	}

	private static int kthLargest(Integer[] arr, int k) {
		Arrays.sort(arr, Collections.reverseOrder());
		return arr[k-1];
	}

}
//Time complexity = O(nLogn)