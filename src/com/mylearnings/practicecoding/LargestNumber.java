package com.mylearnings.practicecoding;

import java.util.Arrays;

public class LargestNumber {
	public static void main(String[] args) {
		System.out.println("--------------------------------");
		int[] number = { 10, 20, 90, 50, 70, 80, 100, 120 };
		System.out.println("List of numbers in a Array " + Arrays.toString(number));
//		for (int list : number) {
//			System.out.println("List of Element" + " " + list);
//		}
		int max = number[0];
		for (int i = 0; i < number.length; i++) {
			if (number[i] > max) {
				max = number[i];
			}
		}
		System.out.println("--------------------------------");
		System.out.println("Maximum number in a Array " + max);
	}
}
