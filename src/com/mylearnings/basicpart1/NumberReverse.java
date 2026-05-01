package com.mylearnings.basicpart1;

import java.util.Arrays;

public class NumberReverse {
	public static void main(String[] args) {
		int arr[] = { 8, 1, 3, 4, 5, 6, 9, 2 };
		int j = 0;
		int temp[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			temp[j] = arr[i];
			j++;
		}
		System.out.println(Arrays.toString(temp));
	}
}
