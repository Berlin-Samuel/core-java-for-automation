/*Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5

Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20*/

package com.mylearnings.basicpart1;

import java.util.Scanner;

public class Area_and_Perimeter_Of_a_Rectangle {

	public static void main(String[] args) {
//		Area = length × width
//		Perimeter = 2 × (length + width)
		Scanner scr = new Scanner(System.in);
		double length, width, area, perimeter;
		System.out.println("Enter the length of the Rectange");
		length = scr.nextDouble();
		System.out.println("Enter the width of the Rectange");
		width = scr.nextDouble();
		area = length * width;
		System.out.println("Area is " + length + " * " + width + "= " + area);
		perimeter = 2 * length + width;
		System.out.println("Perimeter is " + "2"+ " * "  + "(" + length + " + " + width + ")" + "= " + perimeter);
		scr.close();
	}

}
