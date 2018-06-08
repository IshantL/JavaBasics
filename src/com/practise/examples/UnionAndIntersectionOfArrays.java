package com.practise.examples;
import java.util.*;
public class UnionAndIntersectionOfArrays {

	public static void main(String[] args) {
		int arr1[] = {7, 1, 5, 2, 3, 6};
        int arr2[] = {3, 8, 6, 20, 7};
 
        System.out.println("Union of two arrays is : ");
        printUnion(arr1, arr2);
         
        System.out.println("Intersection of two arrays is : ");
        printIntersection(arr1, arr2);   

	}

	private static void printIntersection(int[] arr1, int[] arr2) {
		Set<Integer> s = new HashSet<Integer>();
		for(int i:arr1) 
			s.add(i);
		for(int i:arr2)
			if(s.contains(i))
				System.out.print(i);
		
	}

	private static void printUnion(int[] arr1, int[] arr2) {
		Set<Integer> s = new HashSet<Integer>();
		for(int i:arr1)
			s.add(i);
		for(int i:arr2) 
			s.add(i);
		System.out.println(s);
		
	}

}

// Link : https://www.geeksforgeeks.org/find-union-and-intersection-of-two-unsorted-arrays/

/*
 * Union: Union 1. Initialize an empty hash set hs. 2. Iterate through the first
 * array and put every element of the first array in the set S. 3. Repeat the
 * process for the second array. 4. Print the set hs.
 * 
 * Intersection 1. Initialize an empty set hs. 2. Iterate through the first
 * array and put every element of the first array in the set S. 3. For every
 * element x of the second array, do the following : Search x in the set hs. If
 * x is present, then print it.
 * 
 * Time complexity of this method is Θ(m+n) under the assumption that hash table
 * search and insert operations take Θ(1) time.
 */