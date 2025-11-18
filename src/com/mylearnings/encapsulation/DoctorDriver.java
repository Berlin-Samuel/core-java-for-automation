/**
 * FileName: DoctorDriver.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 12-Nov-2025
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
 * 1.0          12-Nov-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 12-Nov-2025
 */
package com.mylearnings.encapsulation;

import java.util.Scanner;

public class DoctorDriver {
	public static void main(String[] args) {
		System.out.println("Enter Doctor Records");
		System.out.println("====================");
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter Doctor Id");
		int drId = scr.nextInt();
		System.out.println("Enter Doctor Name");
		String drName = scr.next();
		System.out.println("Enter Doctor Age");
		int drAge = scr.nextInt();
		System.out.println("Enter Doctor Speciality");
		String drSpecialist = scr.next();
		Doctor dr = new Doctor(drId, drName, drAge, drSpecialist);
		System.out.println("Calling main Method");
		System.exit(0);
		dr.displayDoctorDetails();
		scr.close();
	}

}
