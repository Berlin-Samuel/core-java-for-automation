/**
 * FileName: HashMapExample.java
 * Author   : Admin
 * Version  : 1.0
 * Date     : 02-Dec-2025
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
 * 1.0          02-Dec-2025        Berlin        Initial Code  
 * 
 * @author Berlin
 * @version 1.0
 * @since 02-Dec-2025
 */
package com.mylearnings.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapExample {
	public static void main(String[] args) {
		// declaration
		// HashMap map = new HashMap();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		// Adding Pairs
		map.put(101, "Aathi");
		map.put(102, "John");
		map.put(103, "Sandra");
		map.put(102, "Davis");
		map.put(104, "Cathrine");
		map.put(105, "Sweety");
		System.out.println(map);
		System.out.println("=============");
		System.out.println(map.keySet());
		System.out.println("=============");
		System.out.println(map.values());
		System.out.println("=============");
		System.out.println("Size ==>>" + map.size());
		System.out.println("=============");
		System.out.println("Removing 105 =>>" + map.remove(105));
		System.out.println(map);
		System.out.println("=============");
		System.out.println("The Value of 102 " + map.get(102));
		System.out.println("=============");
		System.out.println("Entry Set of an Iterator" + map.entrySet());
		System.out.println("=============");
		// Reading data from hashmap
		// Using for each
		for (int Key : map.keySet()) {
			System.out.println(Key + " " + map.get(Key));
		}
		System.out.println("=============");
		// Using Iterator
		Iterator<Entry<Integer, String>> iterate = map.entrySet().iterator();
		while (iterate.hasNext()) {
			Entry<Integer, String> entry = iterate.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		System.out.println("=============");

	}

}
