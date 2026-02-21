package com.mylearnings.basicpart1;

import java.util.Scanner;

public class ReverseString {
	public String reverse(String str) {
		String rev = "";
		for (int j = str.length() - 1; j >= 0; j--) {
			rev += str.charAt(j);
		}
		return rev;
	}

	public static void main(String[] args) {
		System.out.println("Enter the Value");
		Scanner scr = new Scanner(System.in);
		String input = scr.nextLine();
		System.out.println("Before Reverse " + input);
		System.out.println("---------------------");
		ReverseString obj = new ReverseString();
		String output = obj.reverse(input);
		System.out.println("After Reverse " + output);
		System.out.println("---------------------");
		if ((output.equalsIgnoreCase(input))) {
			System.out.println("The Provided input is a Palindrome");
		} else {
			System.out.println("The Provided input is a Not Palindrome");
		}
		System.out.println("=====================");
		StringBuffer revbuff = new StringBuffer(input);
		System.out.println("After Reverse using StringBuffer " + revbuff.reverse());
		String reversedString = revbuff.reverse().toString(); 
		System.out.println("---------------------");
		if ((reversedString.equalsIgnoreCase(output))) {
			System.out.println("The Provided input is a Palindrome");
		} else {
			System.out.println("The Provided input is a Not Palindrome");
		}
		scr.close();
	}
}
