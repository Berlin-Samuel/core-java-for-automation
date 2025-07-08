/*Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5*/

package com.mylearnings.basicpart1;

import java.util.Scanner;

public class BasicArithmeticOperations {
	public static void main(String[] args) {
		int a, b, c;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the first number");
		a = scr.nextInt();
		System.out.println("Enter the second number");
		b = scr.nextInt();
		System.out.println("Type the operation to be Done ");
		System.out.println("");
		System.out.println("sum, multiply, subtract, divide and remainder");
		String operationToBeDone = scr.next();
		switch (operationToBeDone) {
		case "sum":
			c = a + b;
			System.out.println("The sum of two numbers are " + a + "+" + b + "=" + c);
			break;
		case "multiply":
			c = a * b;
			System.out.println("The product of two numbers are " + a + "*" + b + "=" + c);
			break;
		case "subtract":
			c = a - b;
			System.out.println("The subtract of two numbers are " + a + "-" + b + "=" + c);
			break;
		case "divide":
			c = a / b;
			System.out.println("The Division of two numbers are " + a + "/" + b + "=" + c);
			break;
		case "remainder":
			c = a % b;
			System.out.println("The remainder of two numbers are " + a + "%" + b + "=" + c);
			break;

		default:
			System.out.println("Enter the correct operator");

			scr.close();

		}
	}
}
