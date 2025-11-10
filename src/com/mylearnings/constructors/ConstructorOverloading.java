/**
 * FileName: ConstructorOverloading.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 10-Nov-2025
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
 * 1.0          10-Nov-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 10-Nov-2025
 */
package com.mylearnings.constructors;

public class ConstructorOverloading {
	int x;
	int y;

	ConstructorOverloading() {
		x = 1;
		y = 2;
		System.out.println("Constructor Called " + (x + y));
	}

	ConstructorOverloading(int a, int b) {

		x = a;
		y = b;
		System.out.println("The Value of x " + a);
		System.out.println("The Value of y " + b);

	}

	void method1() {
		System.out.println("Invoking Constructor");
		System.out.println("Constructor Called " + (x + y));

	}

}
