/**
 * FileName: Example2.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 16-Oct-2025
 * 
 * This file is part of a personal learning project.
 * 
 * Licensed under the MIT License.
 * 
 * Copyright (c) 2025 Berlin Samuel.
 * Permission is hereby granted, free of charge, to any person obtaining a copy  
 * of this software and associated documentation files (the "Software"), to deal  
 * in the Software without restriction, including without limitation the rights  
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
 * copies of the Software, and to permit persons to whom the Software is  
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in  
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * 
 * REVISION     DATE           NAME         DESCRIPTION  
 * 1.0          16-Oct-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 16-Oct-2025
 */
package com.mylearnings.arrays;

import java.util.Scanner;

public class Example2 {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the limit:");
		int num = scr.nextInt();
		// check if limit is valid
		if (num <= 5) {
			int[] arr = new int[num]; // initialize array
			System.out.println("Enter " + num + " elements:");
			int i = 0;
			while (i < num) { // use < instead of <= to avoid ArrayIndexOutOfBoundsException
				arr[i] = scr.nextInt();
				i++;
			}
			//System.out.println(arr[i]);
			System.out.println("Length of the array "+arr.length);
			System.out.println("Enter the index of the array (0 to " + (num - 1) + "):");
			int select = scr.nextInt();
			if (select >= 0 && select < num) {
				System .out.println("The element at index " + select + " is " + arr[select]);
			} else {
				System.out.println("Array index out of bounds");
			}
		} else {
			System.out.println("Enter a limit less than or equal to 5.");
		}
		scr.close();
	}
}