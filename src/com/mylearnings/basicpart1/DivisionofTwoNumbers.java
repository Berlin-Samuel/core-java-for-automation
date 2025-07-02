/*Write a Java program to divide two numbers and print them on the screen.
Test Data :
50/3
Expected Output :
16*/

package com.mylearnings.basicpart1;

import java.util.Scanner;

public class DivisionofTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		System.out.println("Enter the First Data");
		x = sc.nextInt();
		System.out.println("Enter the Second Data");
		y = sc.nextInt();
		z = x / y;
		System.out.println("The Division of Two Numbers are " + z);
		sc.close();
	}

}
