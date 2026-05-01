package com.mylearnings.basicpart1;

import java.util.Arrays;

public class SortingArray {
	public static void main(String[] args) {
		int arr[] = { 2, 5, 4, 0, 9, 7, 3 };
		System.out.println("Before Sorting");
		for (int j : arr) {
			System.out.print(j);
		}
		System.out.println("\n" + "=======");
		Arrays.sort(arr);
		System.out.println("After Sorting");
		for (int j : arr) {
			System.out.print(j);
		}
	}
}
