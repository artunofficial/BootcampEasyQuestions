package com.EasyJavaQuestions;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int i = scanner.nextInt();
		if(i % 2==0) {
		System.out.println(i + " is Even");
		}else {
		System.out.println(i + " is Odd");
		}
		

	}

}
