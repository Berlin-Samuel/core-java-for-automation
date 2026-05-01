package com.mylearnings.basicpart1;

import java.util.Arrays;

public class BubbleSort {
	static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 7,0, 4, 9, 3 };
		for (int i = 0; i <= arr.length; i++) {
			boolean swapped = false;
			for (int j = 0; j < arr.length -i- 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false) {
				break;
			}
		}
		System.out.println("Sorted array: ");
		// printArray(arr);
		// System.out.println(Arrays.toString(arr));
		for (int ab : arr) {
			System.out.print(ab);
		}
	}
}
