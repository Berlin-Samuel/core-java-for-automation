/*Write a Java program to print the sum of two numbers.
Test Data:
74 + 36
Expected Output :
110*/

package com.mylearnings.basicpart1;

import java.util.Scanner;

public class SumofTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, x;
		System.out.println("Enter the First Number");
		a = sc.nextInt();
		System.out.println("Enter the Second Number");
		b = sc.nextInt();
		x = a + b;
		System.out.println("The Sum of Two Numbers are " + x);
		sc.close();

	}

}
