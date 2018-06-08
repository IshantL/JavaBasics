package com.practise.examples;

public class EveryElementRepeatedTwiceExceptOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {7, 1, 5,1,7};
		int i = singleNumber(arr1);
		System.out.println(i);

	}
	// Return the maximum Sum of difference
    // between consecutive elements.
	public static int singleNumber(int[] A)
	{
	    int ans = 0;
	    for(int i=0;i<A.length;i++)
	    {
	        ans = ans^A[i];
	    }
	 
	    return ans;
	}


}
//Time complexity of this solution is O(n) and it requires O(1) extra space.
