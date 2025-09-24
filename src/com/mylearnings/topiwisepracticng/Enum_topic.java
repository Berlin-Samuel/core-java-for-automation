/**
 * FileName: Enum_topic.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 19-Sept-2025
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
 * 1.0          19-Sept-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 19-Sept-2025
 */

//If User Press 1 for English.
//If User Press 2 for Hindi.
//If User Press 3 for Tamil.

package com.mylearnings.topiwisepracticng;

import java.util.Scanner;

public class Enum_topic {
	public enum StatusCheck {
		English, Hindi, Tamil
	}

	StatusCheck assignStatusCheck;

	public static void main(String[] args) {
		System.out.println(" Enter 1 for English \n Enter 2 for Hindi \n Enter 3 for Tamil");
		System.out.println(" Enter the Number ");
		Scanner scr = new Scanner(System.in);
		int checkValidation = scr.nextInt();
		if (checkValidation == 1) {
			System.out.println("Thanks for choosing " + StatusCheck.English);
		} else if (checkValidation == 2) {
			System.out.println("Thanks for choosing " + StatusCheck.Hindi);
		} else if (checkValidation == 3) {
			System.out.println("Thanks for choosing " + StatusCheck.Tamil);
		} else {
			System.out.println("Enter the Valid Number");
		}
		scr.close();
	}

}
