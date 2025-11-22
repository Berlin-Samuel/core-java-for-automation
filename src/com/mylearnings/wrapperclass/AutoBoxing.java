/**
 * FileName: Example.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 21-Nov-2025
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
 * 1.0          21-Nov-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 21-Nov-2025
 */
package com.mylearnings.wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {

		int i = 10;
		double d = 20.3;
		float f = 25.3f;
		char c = 'a';
		boolean b = false;

		Integer iobj = i;
		Double dobj = d;
		Float fobj = f;
		Character chobj = c;
		Boolean bobj = b;

		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(fobj);
		System.out.println(chobj);
		System.out.println(bobj);
	}
}
