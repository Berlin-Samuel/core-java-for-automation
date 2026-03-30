package com.mylearnings.practicecoding;

import java.util.Arrays;

public class SmallestNumber {
	public static void main(String[] args) {
		int[] number = { 10, 0, -2, 5, 4, 6, 9 };
		int min = number[0];
		System.out.println("List of numbers in a Array " + Arrays.toString(number));
		for (int i = 0; i < number.length; i++) {
			if (number[i] > min) {
				min = number[i];
			}
		}
		System.out.println("Minimum number in a Array " + min);
	}
}