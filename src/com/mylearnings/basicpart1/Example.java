package com.mylearnings.basicpart1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Example {
	public static void main(String[] args) {
		System.out.println("================================");
		int[] arr = { 1, 2, 3, 4, 5, 2, 1, 2, 1, 4, 3, 5, 6, 7 };
		System.out.println("Elements in an Array " + Arrays.toString(arr));
		System.out.println("================================");

		List<Integer> value = new ArrayList<>();
		Set<Integer> duplicate = new HashSet<>();
		Set<Integer> nonDuplicate = new HashSet<>();
		for (int arrValue : arr) {
			value.add(arrValue);
		}
		for (int num : value) {
			if (!nonDuplicate.add(num)) {
				duplicate.add(num);
			}
		}
		System.out.println("Duplicated Values :" + duplicate);
		System.out.println("================================");
		System.out.println("Non Duplicated Values :" + nonDuplicate);
	}
}
