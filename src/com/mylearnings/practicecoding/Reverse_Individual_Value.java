package com.mylearnings.practicecoding;

public class Reverse_Individual_Value {
	public static void main(String[] args) {
		String input = "Hello World Java";
		System.out.println("Before Reverse : " + input);
		String[] words = input.split(" ");
		String result = "";
		for (String word : words) {
			String reversed = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				reversed += word.charAt(i);
			}

			result += reversed + " ";
		}
		System.out.println("After  Reverse : " + result.trim());
	}
}