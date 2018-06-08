package com.practise.examples;

public class TopTwoNumbersFromAnIntegerArray {

	public static void main(String[] args) {
		int num[] = {5,34,78,2,45,1,99,23};
		printTwoMaxNumbers(num);
	}

	private static void printTwoMaxNumbers(int[] num) {
		int maxOne = 0;
		int maxTwo = 0;
		for (int i : num) {
			if (maxOne < i) {
				maxTwo = maxOne;
				maxOne = i;
			} else if (maxTwo < i) {
				maxTwo = i;
			}
		}
		System.out.println("First Max Number: "+maxOne);
        System.out.println("Second Max Number: "+maxTwo);

	}
	
	//You can use with sorting also

}
