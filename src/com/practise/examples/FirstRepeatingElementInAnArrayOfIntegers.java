package com.practise.examples;
import java.util.*;
public class FirstRepeatingElementInAnArrayOfIntegers {

	public static void main(String[] args) {
		int arr[] = {10, 5, 3, 4, 5,3, 6};
        printFirstRepeating(arr);

	}

	private static void printFirstRepeating(int[] arr) {
		int min =-1;
		Set<Integer> hs = new HashSet<Integer>();
		// Traverse the input array from right to left
		for(int i = arr.length-1 ; i>=0;i--) {   // If they asked last repeating element traverse from beginning for(int i = 0 ; i<=arr.length-1;i++)
			// If element is already in hash set, update min
			if(hs.contains(arr[i]))
				min =i;
			else // Else add element to hash set
				hs.add(arr[i]);
		}
		if(min !=-1)
			System.out.println(arr[min]);
		
	}

}
