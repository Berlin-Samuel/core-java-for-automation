/*Write a Java program to compute a specified formula.

Specified Expression :
4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))*/

package com.mylearnings.basicpart1;

public class ExpressionEvaluation {
	public static void main(String[] args) {
		double result = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
		System.out.println("Specified Expression :\n" + "4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))"
				+ "=" + result);
	}

}
