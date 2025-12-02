/**
 * FileName: HashsetExample.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 01-Dec-2025
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
 * 1.0          01-Dec-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 01-Dec-2025
 */
package com.mylearnings.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetExample {
	public static void main(String[] args) {
		// Declaraction
		HashSet mySet = new HashSet();
		// Set mySet = new HashSet();
		// adding elements in Hashset
		mySet.add(100);
		mySet.add(20.2);
		mySet.add(false);
		mySet.add(null);
		mySet.add("Hello");
		mySet.add('c');
		mySet.add(null);
		mySet.add("Hello");
		System.out.println(mySet);
		System.out.println("=========");
		// Removing element
		mySet.remove(20.2);// 20.2 is a value(not a index)
		System.out.println("=========");
		System.out.println(mySet);
		System.out.println("=========");

		// Inserting element is not possible
		// Access Specific Element is not possible

		// Convert HashSet --> ArrayList

		ArrayList al = new ArrayList(mySet);
		System.out.println(al);
		System.out.println("=========");
		System.out.println(al.get(1));
		System.out.println("==================");

		// Reading all the all the elements from HashSet
		// 2) Using for each loop
		for (Object x : mySet) {
			System.out.println(x);
		}
		System.out.println("==================");
		// 3) Using Iterator
		Iterator iterate = mySet.iterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		System.out.println("==================");
		mySet.clear();
		System.out.println(mySet.isEmpty());
		System.out.println("==================");
		System.out.println(mySet);
		System.out.println("==================");
		System.out.println(mySet.size());
	}
}
