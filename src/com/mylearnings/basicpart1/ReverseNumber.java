package com.mylearnings.basicpart1;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {

	public static int[] reverse(int[] arr) {
		int[] rev = new int[arr.length];
		int j = 0;

		for (int i = arr.length - 1; i >= 0; i--) {
			rev[j] = arr[i];
			j++;
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("Enter the limit");
		Scanner scr = new Scanner(System.in);
		int maxvalue = scr.nextInt();
		System.out.println("----------");
		int[] arr = new int[maxvalue];
		for (int a = 0; a < arr.length; a++) {
			arr[a] = scr.nextInt();
		}
		System.out.println("Array elements are " + Arrays.toString(arr));
		System.out.println("------------");
		System.out.println("Array elements are:");
		for (int value : arr) {
			System.out.print(value + " ");
		}
		int[] rev = reverse(arr);
		System.out.println("Array elements are " + Arrays.toString(rev));
		System.out.println("------------");
		scr.close();
	}
}
