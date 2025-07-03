/*Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80*/

package com.mylearnings.basicpart1;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Enter the value to be multiplied");
		int x = inputScanner.nextInt();
		System.out.println("Enter the multiplication value limit");
		int j = inputScanner.nextInt();
		for (int k = 1; k <= j; k++) {
			System.out.println(x + " * " + k + "=" + (k * x));
		}
		inputScanner.close();
	}

}
