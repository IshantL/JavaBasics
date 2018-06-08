package com.practise.examples;

public class FindTheSmallestPositiveIntegerValueThatCannotBeRepresentedAsSumOfAnySubsetOfAGivenArray {

	public static void main(String[] args) {
		int arr2[] = {1, 2, 6, 10, 11, 15};
        int n2 = arr2.length;
        System.out.println(findSmallest(arr2, n2));

	}

	private static int findSmallest(int[] arr, int n) {
		// TODO Auto-generated method stub
		int res=1;
		 // Traverse the array and increment 'res' if arr[i] is
        // smaller than or equal to 'res'.
		for(int i=0;i<n&&arr[i]<=res;i++) {
			res = res+arr[i];
		}
		return res;
	}
	/*sorted the array
	calculated the prefix sum*/
	//Time Complexity of above program is O(n).
	
	
	/*
	 * A Simple Solution is to start from value 1 and check all values one by
	 * one if they can sum to values in the given array. This solution is very
	 * inefficient as it reduces to subset sum problem which is a well known NP
	 * Complete Problem.
	 * 
	 * We can solve this problem in O(n) time using a simple loop. Let the input
	 * array be arr[0..n-1]. We initialize the result as 1 (smallest possible
	 * outcome) and traverse the given array. Let the smallest element that
	 * cannot be represented by elements at indexes from 0 to (i-1) be ‘res’,
	 * there are following two possibilities when we consider element at index
	 * i:
	 * 
	 * 1) We decide that ‘res’ is the final result: If arr[i] is greater than
	 * ‘res’, then we found the gap which is ‘res’ because the elements after
	 * arr[i] are also going to be greater than ‘res’.
	 * 
	 * 2) The value of ‘res’ is incremented after considering arr[i]: The value
	 * of ‘res’ is incremented by arr[i] (why? If elements from 0 to (i-1) can
	 * represent 1 to ‘res-1’, then elements from 0 to i can represent from 1 to
	 * ‘res + arr[i] – 1’ be adding ‘arr[i]’ to all subsets that represent 1 to
	 * ‘res’)
	 */

}
