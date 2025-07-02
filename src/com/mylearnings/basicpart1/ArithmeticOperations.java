/*Write a Java program to print the results of the following operations.
Test Data:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Expected Output :
43
1
19
13*/

package com.mylearnings.basicpart1;

public class ArithmeticOperations {
	public static void main(String[] args) {
		int a=-5 + 8 * 6;
		int b=(55+9) % 9;
		int c=20 + -3*5 / 8;
		int d=5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("Expected Output :"+"\n "+a+"\n "+b+"\n "+c+"\n "+d);
	}

}
