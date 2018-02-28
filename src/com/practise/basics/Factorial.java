package com.practise.basics;

import java.io.InputStream;
import java.util.Scanner;

public class Factorial {
/*
 * You have been given a positive integer . You need to find and print the Factorial of this number. The Factorial of a positive integer  refers to the product of all number in the range from  to . You can read more about the factorial of a number here.

Input Format:
The first and only line of the input contains a single integer  denoting the number whose factorial you need to find.

Output Format
Output a single line denoting the factorial of the number .
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int no=sc.nextInt();
		int fact=1;
		for (int i = no; i >= 1; i--) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
