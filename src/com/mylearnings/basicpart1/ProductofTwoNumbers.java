/*Write a Java program that takes two numbers as input and displays the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output :
25 x 5 = 125*/

package com.mylearnings.basicpart1;

import java.util.Scanner;

public class ProductofTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float x, y, z;
		System.out.println("Enter the first number:");
		x = scanner.nextFloat();
		System.out.println("Enter the second number:");
		y = scanner.nextFloat();
		z = x * y;
		System.out.println("The Product of Two Numbers are " + x + " * " + y + " = " + z);
		scanner.close();
	}

}
