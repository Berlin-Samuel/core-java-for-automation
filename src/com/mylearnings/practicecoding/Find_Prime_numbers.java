/**
 * FileName: Find_Prime_numbers.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 24-Sept-2025
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
 * 1.0          24-Sept-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 24-Sept-2025
 */
package com.mylearnings.practicecoding;

import java.util.Scanner;

public class Find_Prime_numbers {

//	static boolean isPrime(int num, int divisor) {
//		if (num <= 1)
//			return false;
//		if (divisor == 1)
//			return true;
//		if (num % divisor == 0)
//			return false;
//		return isPrime(num, divisor - 1);
//	}

    public static boolean isPrime(int num) {
        if (num <= 1) return false;  // numbers ≤ 1 are not prime
        if (num == 2) return true;   // 2 is prime

        // check divisors from 2 to num/2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; // found a divisor → not prime
            }
        }
        return true; // no divisors found → prime
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num))
            System.out.println(num + " is Prime.");
        else
            System.out.println(num + " is NOT Prime.");

        sc.close();
    }
}

//		if (isPrime(num, num / 2))
//			System.out.println(num + " is Prime.");
//		else
//			System.out.println(num + " is NOT Prime.");

//sc.close();}}
