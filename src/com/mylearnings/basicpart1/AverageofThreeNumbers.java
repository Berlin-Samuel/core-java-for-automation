//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.

package com.mylearnings.basicpart1;

import java.util.Scanner;

public class AverageofThreeNumbers {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the maximum value");
		int value, x = 0;
		value = scr.nextInt();
		int[] input = new int[value];
		System.out.println("Enter the values");
		for (int j = 1; j <= input.length; j++) {
			x += scr.nextInt();
		}
		scr.close();
		double avg = (x / input.length);
		System.out.println("The Average of the given numbers are " + avg);

	}
}
