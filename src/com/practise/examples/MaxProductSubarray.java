package com.practise.examples;

public class MaxProductSubarray {

	public static void main(String[] args) {
		int arr[] = {1, -2, -3, 0, 7, -8, -2};
        System.out.println("Maximum Sub array product is ");
        maxProductSubarray(arr);

	}

	public static void maxProductSubarray(int arr[]) {
		int max = arr[0];
		int temp = max;
		int end = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 0) {
				temp = 1;
				continue;
			}
			temp = temp * arr[i];
			if (temp > max) {
				end = i;
				max = temp;
			}
		}
		while (max != 1) {
			System.out.println(arr[end]);
			max = max / arr[end];
			end--;
		}

	}

}
