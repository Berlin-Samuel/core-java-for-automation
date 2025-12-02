/**
 * FileName: ArrayInitialize1.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 19-Oct-2025
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
 * 1.0          19-Oct-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 19-Oct-2025
 */
package com.mylearnings.arrays;

public class ArrayInitialize1 {
	public static void main(String[] args) {
		String str = new String("Hello");
		System.out.println("Print str value " + str);
		int arr[] = { 4, 2, 6, 7, 10,10 };
		arr[1] = 50;
		// System.out.println("To string"+arr.toString());
		System.out.println("Array Length " + arr.length);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("Print the Value " + arr[1]);
	}
}
