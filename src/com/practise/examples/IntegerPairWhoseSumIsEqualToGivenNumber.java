package com.practise.examples;
import java.util.*;
public class IntegerPairWhoseSumIsEqualToGivenNumber {

	public static void main(String[] args) {
		prettyPrint(new int[]{4, 0, 10, 10, 14, 0, 10, 11, 8,-1,-2}, 12);
	     //  prettyPrint(getRandomArray(10), 12);

	}

	public static void printPairsUsingSet(int[] numbers, int n) {
		if (numbers.length < 2) {
			return;
		}
		Set set = new HashSet(numbers.length);
		for (int value : numbers) {
			int target = n - value;
			// if target number is not in set then add 
			if (!set.contains(target)) {
				set.add(value);
			} else {
				System.out.printf("(%d, %d) %n", value, target);
			}
		}
	}
	
	public static void prettyPrint(int[] random, int k) {
		System.out.println("Random Integer array : " + Arrays.toString(random));
		System.out.println("Sum : " + k);
		System.out.println("pair of numbers from an array whose sum equals "
				+ k);
		printPairsUsingSet(random, k);
	}

	public static int[] getRandomArray(int length) {
		int[] randoms = new int[length];
		for (int i = 0; i < length; i++) {
			randoms[i] = (int) (Math.random() * 15);
		}
		return randoms;
	}

	

	
	}

	
	


