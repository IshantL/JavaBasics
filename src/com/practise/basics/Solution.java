package com.practise.basics;

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
    	 Scanner in = new Scanner(System.in);
         int n = in.nextInt();
         int[] a = new int[n];
         for(int a_i=0; a_i < n; a_i++){
             a[a_i] = in.nextInt();
         }
         bubbleSort(a);
    }

	public static void bubbleSort(int[] unsortedArray) {
		int lastIndex= unsortedArray.length-1;
		int noOfSwap=0;
		int noOfSwapping=0;
		while(lastIndex>0){
			noOfSwap=0;
		for (int i = 0; i < lastIndex; i++) {
			if(unsortedArray[i]>unsortedArray[i+1]){
				int tmp=unsortedArray[i];
				unsortedArray[i]=unsortedArray[i+1];
				unsortedArray[i+1]=tmp;
				noOfSwap=i;
				noOfSwapping++;			}
            //printArray("Current", unsortedArray);
			//end for
		}
        
		lastIndex=noOfSwap;
		}
		//end while
        //printArray("Sorted", unsortedArray);

        System.out.println("Array is sorted in "+ noOfSwapping+" swaps");
        System.out.println("First Element:"+ unsortedArray[0]);
        System.out.println("Last Element:"+ unsortedArray[unsortedArray.length-1]);

	}

	public static void printArray(String s, int[] x) {
		 System.out.print(s + " Array: ");
	        for(int i : x){
	            System.out.print(i + " ");
	        }
	        System.out.println();		
	}
}