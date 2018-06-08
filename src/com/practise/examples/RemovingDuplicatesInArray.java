package com.practise.examples;
import java.util.Arrays;


public class RemovingDuplicatesInArray {

	public static void main(String[] args) {
		int[][] test = new int[][]{
	            {1, 1, 2, 2, 3, 4, 5},
	            {1, 1, 1, 1, 1, 1, 1},
	            {1, 2, 3, 4, 5, 6, 7},
	            {1, 2, 1, 1, 1, 1, 1},};


	           for(int input[] : test) {
	        	   System.out.println("After removing duplicates: "+Arrays.toString(removeDuplicates(input)));
	           }

	}

	private static int[] removeDuplicates(int[] input) {
		Arrays.sort(input);
		int[] result = new int[input.length];
		int previous = input[0];
		result[0] = previous;
		for(int j=1;j<input.length;j++) {
			if(previous != input[j]) {
				result[j] = input[j];
			}
			previous = input[j];
			
		}
		return result;
	}

}


/*
 * In this program, we have not used any collection class to remove duplicates,
 * earlier, I had shown you a way to remove duplicates from ArrayList, which was
 * using LinkedHashSet. You can still use that solution if the interviewer
 * doesn't mention without Collection specifically.
 * 
 * All you need to do is to convert your array into ArrayList first then
 * subsequently create a LinkedHashSet from that ArrayList. In this example, we
 * are removing duplicates from the array by not copying them into result array,
 * this solution is not actually deleting duplicates instead it replacing it
 * with default value i.e. zero.
 */



/*
 * That's it about how to remove duplicates from an array in Java without using
 * Collection class. As I said before, this solution is not perfect and has some
 * serious limitation, which is an exercise for you to find out. One hint I can
 * give is that array itself can contain default value as duplicates e.g. 0 for
 * int, even if you use any Magic number e.g. Integer.MAX_VALUE, you can not be
 * certain that they will not be part of the input.
 * 
 * Regarding removing duplicate permanently from result array, one approach
 * could be to count a number of duplicates and then create an array of right
 * size i.e. length - duplicates, and then copying content from intermediate
 * result array to final array, leaving out elements which are marked duplicate.
 */


