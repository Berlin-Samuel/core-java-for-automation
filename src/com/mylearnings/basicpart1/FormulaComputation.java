/*Write a Java program to compute a specified formula.
Specified Formula :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
Expected Output
2.9760461760461765*/

package com.mylearnings.basicpart1;

public class FormulaComputation {
	public static void main(String[] args) {
		double specifiedFormula = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
		System.out.println("Expected Output is " + specifiedFormula);
	}

}
