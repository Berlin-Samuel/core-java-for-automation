/*Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
package com.mylearnings.basicpart1;

import java.util.Scanner;

public class AreaandPerimeterOfCircle {
	public static void main(String[] args) {
		Scanner getValue = new Scanner(System.in);
		System.out.println("Enter the Radius of the Circle");
		double inputRadius = getValue.nextDouble();
		// Perimeter=2πr
		// Area=π(r*r)
		// inputRadius= radius of the circle
		// π (pi) ≈ 3.1416
		System.out.println("Perimeter is " + "= " + (2 * 3.14 * inputRadius));
		System.out.println("Area is " + "= " + 3.14 * (inputRadius * inputRadius));
		System.out.println("Area is " + "= " + Math.PI * (inputRadius * inputRadius));
		getValue.close();
	}

}
