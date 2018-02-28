package com.practise.basics;

import java.util.Scanner;

public class InpOutPractise2PrimeNo {
/*
 * You are given an integer N. You need to print the series of all prime numbers till N.

Input Format

The first and only line of the input contains a single integer N denoting the number till where you need to find the series of prime number.

Output Format

Print the desired output in single line separated by spaces.

Constraints

1<=N<=1000
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int count;
		for (int i = 2; i <= N; i++) {
			count=0;
			for (int j = 2; j < i; j++) {
				if(i%j==0){
					count++;
					break;
				}
			}
			if(count==0){
				System.out.print(i+" ");
			}
		}
	}

}
