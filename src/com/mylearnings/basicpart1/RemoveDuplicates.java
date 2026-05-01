package com.mylearnings.basicpart1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = { 1, 9, 10, 7, 2, 2, 3, 4, 5, 5, 8 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		Set<Integer> duplicate = new LinkedHashSet();
		for (int i : arr) {
			duplicate.add(i);
		}
		System.out.println(duplicate);
	}
}
