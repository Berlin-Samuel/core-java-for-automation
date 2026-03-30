package com.mylearnings.practicecoding;

import java.util.Arrays;

public class SecondLargestNumber {
	public static void main(String[] args) {
		System.out.println("--------------------------------");
		int[] value = { 10, 20, 90, 50, 70, 80, 100, 120 };
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		System.out.println("List of numbers in a Array " + Arrays.toString(value));
		for (int i = 0; i < value.length; i++) {
			if (value[i] > max) {
				second_max = max;
				max = value[i];
			} else if ((value[i] > second_max) && (value[i] > max)) {
				second_max = value[i];
			}
		}
		System.out.println("--------------------------------");
		System.out.println("Largest Element " + max);
		System.out.println("--------------------------------");
		System.out.println("Second Largest Element " + second_max);
	}
}
