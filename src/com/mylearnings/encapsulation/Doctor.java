/**
 * FileName: Doctor.java
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

public class Doctor {
	private int id;
	private String name;
	private int age;
	private String specialist;

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAge(int age) {
			this.age = age;
	}

	public int getaAge() {
		return age;
	}

	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}

	public String getSpecialist() {
		return specialist;
	}

	Doctor(int did, String dname, int dage, String dspecialist) {
		setId(did);
		setName(dname);
		setAge(dage);
		setSpecialist(dspecialist);
	}

	public void displayDoctorDetails() {
		System.out.println("Doctors Record Shown");
		System.out.println("Doctor Id " + id);
		System.out.println("Doctor Name " + name);
		System.out.println("Doctor Age " + age);
		System.out.println("Doctor Specialist " + specialist);

	}

}
