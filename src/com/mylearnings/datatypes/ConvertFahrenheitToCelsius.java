/*Write a Java program to convert temperature from Fahrenheit to Celsius degrees.
Test Data
Input a degree in Fahrenheit: 212
Expected Output:
212.0 degree Fahrenheit is equal to 100.0 in Celsius*/

package com.mylearnings.datatypes;

import java.util.Scanner;

public class ConvertFahrenheitToCelsius {

	public static void main(String[] args) {
		double celcius, fahrenheit;
		Scanner scr = new Scanner(System.in);
		System.out.println("Which type of tempature converson to be done" + "/n"
				+ " either Fahrenheit to Celsius or Celsius to Fahrenheit ");
		System.out.println("------------------------------------");
		System.out.println("Please type c to f or f to c");
		String temperatureConversion = scr.nextLine();
		switch (temperatureConversion) {
		case ("c to f"):
			System.out.println("Fahrenheit =");
			fahrenheit = scr.nextDouble();
			celcius = (fahrenheit - 32) * (5.0 / 9.0);
			System.out.println("The temperature in Celcius :" + celcius);
			break;
		case ("f to c"):
			System.out.println("Celcius =");
			celcius = scr.nextDouble();
			fahrenheit = (celcius * 9.0 / 5.0) + 32;
			System.out.println("The temperature in Fahrenheit :" + fahrenheit);
			break;
		default:
			System.out.println("Please enter the correct input");
		}
		scr.close();

	}
}