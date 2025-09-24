/**
 * FileName: Find_Even_Or_Odd.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 08-Sept-2025
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
 * 1.0          08-Sept-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 08-Sept-2025
 */

/*Given a positive integer n, determine whether it is odd or even. Return true if the number is even and false if the number is odd.

Input: n = 15
Output: false
Explanation: The number is not divisible by 2, Odd number.

Input: n = 44
Output: true
Explanation: The number is divisible by 2, Even number.

*/

package com.mylearnings.practicecoding;

import java.util.Scanner;

public class Find_Even_Or_Odd {

	public static void main(String[] args) {
		System.out.println("Check whether the number is Even or Odd");
		System.out.print("Enter the Number: ");

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		switch (num % 2) {
		case 0:
			System.out.println(num + " is an Even Number");
			break;
		case 1:
			System.out.println(num + " is an Odd Number");
			break;
		default:
			System.out.println("Enter the Valid Number");
		}
		scan.close();
	}
}