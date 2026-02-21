package com.mylearnings.basicpart1;

public class DuplicateAndNonDuplicateElement {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 5, 3, 1, 2, 5, 6, 7, 4, 9, 4, 8 };
		System.out.println("List of Duplicate Elements");
		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == num[j]) {
					System.out.print(num[i] + " ");
				}
			}
		}
		System.out.println();
		System.out.println("List of Non Duplicate Elements");
		for (int i = 0; i < num.length; i++) {
			int count = 0;

			for (int j = 0; j < num.length; j++) {
				if (num[i] == num[j]) {
					count++;
				}
			}

			if (count == 1) {
				System.out.print(num[i] + " ");
			}
		}
	}
}
