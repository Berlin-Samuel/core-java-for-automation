//Write a Java program to swap two variables.

package com.mylearnings.basicpart1;

import java.util.Scanner;

public class SwapVariables {

	public static void main(String[] args) {
		Scanner getInput = new Scanner(System.in);
		int firstValue, secondValue, afterSwapping;
		System.out.println("Enter the First Value");
		firstValue = getInput.nextInt();
		System.out.println("Enter the Second Value");
		secondValue = getInput.nextInt();
		System.out.println("----------------------");
		System.out.println("Before Swapping the First Value " + firstValue);
		System.out.println("Before Swapping the Second Value " + secondValue);
		System.out.println("----------------------");
		afterSwapping = firstValue;
		firstValue = secondValue;
		secondValue = afterSwapping;
		System.out.println("After Swapping the First Value " + firstValue);
		System.out.println("After Swapping the Second Value " + secondValue);
		getInput.close();
	}

}
