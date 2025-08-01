/**
 * FileName: ConvertInchestoMeters.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 29-July-2025
 * 
 * This file is part of a personal learning project.
 * 
 * Licensed under the MIT License.
 * 
 * Copyright (c) 2025 Berlin Samuel.
 * Permission is hereby granted, free of charge, to any person obtaining a copy  
 * of this software and associated documentation files (the "Software"), to deal  
 * in the Software without restriction, including without limitation the rights  
 * to use, copy, modify, merge, publish, distribute, sub license, and/or sell  
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
 * 1.0          29-Jul-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 29-Jul-2025
 */

/* Write a Java program that reads a number in inches and converts it to meters.

The inch is a unit of length in the (British) imperial and United States customary systems of measurement now formally equal to ​1/36 yard but usually understood as ​1/12 of a foot.

The meter is the base unit of length in some metric systems, including the International System of Units (SI). The SI unit symbol is m.

Note: One inch is 0.0254 meter.

Test Data
Input a value for inch: 1000 */

package com.mylearnings.datatypes;

import java.util.Scanner;

public class ConvertInchestoMeters {

	public static void main(String[] args) {
		double inch, meter;
		System.out.println("Please Enter the value in Inches");
		Scanner scanner = new Scanner(System.in);
		inch = scanner.nextDouble();
		meter = inch * 0.0254;
		System.out.println("The Values in meter " + meter);
		scanner.close();
	}

}
