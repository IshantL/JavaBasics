package com.practise.examples;

public class FindCommonElementsInThreeSortedArrays {

	public static void main(String[] args) {
		int ar1[] = {1, 5, 10, 20, 40, 80};
        int ar2[] = {6, 7, 20, 80, 100};
        int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
 
        System.out.print("Common elements are ");
        findCommon(ar1, ar2, ar3);

	}

	private static void findCommon(int[] ar1, int[] ar2, int[] ar3) {
		int i=0,j=0,k=0;
		while(i<ar1.length && j<ar2.length && k<ar3.length) {
			if(ar1[i]==ar2[j] && ar2[j]==ar3[k]) {
				System.out.println(ar1[i]+" ");
				i++;j++;k++;
			} else if(ar1[i] < ar2[j]) {
				i++;
			}else if(ar2[j] < ar3[k]) {
				j++;
			}else 
				k++;
		}
		
	}

}





//Other way
/*
 * A simple solution is to first find intersection of two arrays and store the
 * intersection in a temporary array, then find the intersection of third array
 * and temporary array. Time complexity of this solution is O(n1 + n2 + n3)
 * where n1, n2 and n3 are sizes of ar1[], ar2[] and ar3[] respectively.
 * 
 * The above solution requires extra space and two loops, we can find the common
 * elements using a single loop and without extra space. The idea is similar to
 * intersection of two arrays. Like two arrays loop, we run a loop and traverse
 * three arrays.
 */
