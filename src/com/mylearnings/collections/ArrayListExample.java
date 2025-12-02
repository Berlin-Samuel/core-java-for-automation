/**
 * FileName: ArrayList.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 30-Nov-2025
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
 * 1.0          30-Nov-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 30-Nov-2025
 */
package com.mylearnings.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// Declaraction
		ArrayList myList = new ArrayList();
		// List myLists = new ArrayList();

		// Adding data in the arraylist
		myList.add(100);
		myList.add("Welcome");
		myList.add(10.3);
		myList.add('s');
		myList.add(true);
		myList.add(null);
		System.out.println("Size of the Array List " + myList.size());
		System.out.println("================");
		System.out.println("Printing data from arraylist " + myList);
		System.out.println("================");
		// remove element from arraylist
		myList.remove(2);
		System.out.println("Printing data from arraylist after removing the element " + myList);
		myList.add(1, "Jawa");
		System.out.println("================");
		// insert element from arraylist
		System.out.println("Printing data from arraylist after insertion the element " + myList);
		System.out.println("================");
		// Modify the element
		myList.set(1, "PHP");
		System.out.println("Printing data from arraylist after replacing/modify the element " + myList);
		System.out.println("================");
		System.out.println("Printing data from arraylist after accessing the specific element ==>> " + myList.get(4));
		System.out.println("================");
		// Reading all the all the elements from arraylist
		// 1) Using normal for loop
		for (int i = 0; i < myList.size(); i++) {
			System.out.println(myList.get(i));
		}
		System.out.println("==================");
		// 2) Using for each loop
		for (Object x : myList) {
			System.out.println(x);
		}
		System.out.println("==================");
		// 3) Using Iterator
		Iterator iterate = myList.iterator();
		while (iterate.hasNext()) {
			System.out.println(iterate.next());
		}
		System.out.println("==================");
		System.out.println("Is array is empty " + myList.isEmpty());
		System.out.println("==================");
		ArrayList myList2 = new ArrayList();
		myList2 = myList;
		myList2.add('s');
		myList2.add(true);
		System.out.println("Value is My List2 " + myList2);
		System.out.println("==================");
		//myList.removeAll(myList2);
		System.out.println("Printing data from arraylist " + myList);

	}

}
