package com.EasyJavaQuestions;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Input the first number: ");
        double a = scan.nextDouble();
        System.out.print("Input the second number: ");
        double b = scan.nextDouble();
        System.out.print("Input the third number: ");
        double c = scan.nextDouble();
        System.out.print("The average value is " + average(a, b, c));
    }

	public static double average(double a, double b, double c) {
		
		return (a + b + c) / 3;
	}

}
