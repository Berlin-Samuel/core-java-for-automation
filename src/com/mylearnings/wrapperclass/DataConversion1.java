/**
 * FileName: DataConversion1.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 22-Nov-2025
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
 * 1.0          22-Nov-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 22-Nov-2025
 */
package com.mylearnings.wrapperclass;

public class DataConversion1 {
	public static void main(String[] args) {
		// int to string
		int x = 100;
		String s = String.valueOf(x);
		System.out.println(s);
		System.out.println("============");

		double db = 22.56;
		String s1 = String.valueOf(db);
		System.out.println(s1);
		System.out.println("============");

		boolean b = true;
		String s2 = String.valueOf(b);
		System.out.println(s2);
		System.out.println("============");

		char c = 'w';
		String s3 = String.valueOf(c);
		System.out.println(s3);
	}

}
