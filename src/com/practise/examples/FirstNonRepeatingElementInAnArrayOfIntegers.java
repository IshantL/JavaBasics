package com.practise.examples;
import java.util.HashSet;
import java.util.Set;


public class FirstNonRepeatingElementInAnArrayOfIntegers {

	public static void main(String[] args) {
		int arr[] = {6, 11, 3,10, 4, 3, 5, 6};
        printFirstNonRepeating(arr);

	}

	private static void printFirstNonRepeating(int[] arr) {
		int min =-1;
		Set<Integer> hs = new HashSet<Integer>();
		// Traverse the input array from right to left
		for(int i = arr.length-1 ; i>=0;i--) {   // If they asked last repeating element traverse from beginning for(int i = 0 ; i<=arr.length-1;i++)
			// If element is already in hash set, update min
			if(!hs.contains(arr[i])) {
				hs.add(arr[i]);
				min =i;
			}
			
		}
		if(min !=-1)
			System.out.println(arr[min]);
		
	}

}
