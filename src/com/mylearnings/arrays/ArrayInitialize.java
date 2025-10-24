/**
 * FileName: ArrayInitialize.java
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

import java.util.Scanner;

public class ArrayInitialize {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Checking Array");
		int getValue;
		int check;
		try {
			getValue = scr.nextInt();
			int[] arr1 = new int[getValue];
			if (getValue > 0 && getValue <= 10) {
				System.out.println("Adding array in :");
				for (check = 0; check < getValue; check++) {
					arr1[check] = scr.nextInt();
				}
				scr.close();
				System.out.println("The Values in the Array are :");
				for (int displayArray = 0; displayArray < arr1.length; displayArray++) {
					System.out.println(arr1[displayArray]);
				}
			} else {
				System.out.println("Enter the number limit within 10");
			}
		} finally {
			scr.close();
		}

	}
}
