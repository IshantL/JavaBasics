package com.practise.basics;

import java.util.Scanner;
/*
 * Sample Input: 
L = 5, R = 10

Sample Output: 
5 6 7 8 9 10
 * */


public class ArrayInput {

	public static void main(String[] args) {
	    
	    
		Scanner s = new Scanner(System.in);
	    
	    // Get L and R from the input
		int L = s.nextInt();
		int R = s.nextInt();
    
        // Write here the logic to print all integers between L and R
        for (int i=L;i<=R;i++){
            System.out.print(i);
        }

		s.close();
	}
}