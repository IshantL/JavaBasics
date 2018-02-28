package com.practise.basics;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int noOfTestcase=sc.nextInt();
		String str1 = null;
		String str2 = null;
		
		for (int k = 0; k < noOfTestcase; k++) {
			int count = 0;
			str1 = sc.next();	
			str2 = sc.next();
			int count1[] = new int[26]; 
	        int count2[] = new int[26];
	 
	        // count frequency of each charcter 
	        // in first string
	        for (int i = 0; i < str1.length() ; i++)
	            count1[str1.charAt(i) -'a']++;
	     
	        // count frequency of each charcter 
	        // in second string
	        for (int i = 0; i < str2.length() ; i++)
	            count2[str2.charAt(i) -'a']++;
	 
	        // traverse count arrays to find 
	        // number of charcters to be removed
	        int result = 0;
	        for (int i = 0; i < 26; i++)
	            result += Math.abs(count1[i] -
	                               count2[i]);
	        System.out.println(result);
		}
		
		
	}

}

