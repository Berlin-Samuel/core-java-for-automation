/**
 * FileName: Example.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 20-Oct-2025
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
 * 1.0          20-Oct-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 20-Oct-2025
 */
package com.mylearnings.strings;

import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
		String str = "Hello";
		String str1 = "Hello";
		System.out.println("--------- ");
		System.out.println(str.charAt(0));
		System.out.println(str.equals(str1));
		System.out.println(str);		
		System.out.println("--------- ");
		String s1 = "Welcome World";
		System.out.println("--------- ");
		String s2 = "  New World ";
		System.out.println(s2.trim());
		System.out.println(s1.replace("Welcome", "Hello"));
		System.out.println(str.compareTo(str1));
		System.out.println(s1.substring(2, 5));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println("--------- ");
		String[] arr = s1.split(" ");
		System.out.println("--------- ");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println("--------- "); 
		String str2 = "Welcome#123@456";
		System.out.println(str2.replace("#", "").replace("@", ""));
		char c=65;
		System.out.println(c);
		System.out.println("-----------");
		System.out.println(s1.equals("WELCOME WORLD"));
		System.out.println(s1.equalsIgnoreCase("WELCOME WORLD"));
	}

}
