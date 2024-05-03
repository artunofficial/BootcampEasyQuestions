package com.EasyJavaQuestions;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		
		int count = 0;
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a number");
	     
	      int n = scanner.nextInt();
	      // to check prime number
	      if(n == 2) {
	         System.out.println(n + " is a prime number");
	      } else {
	         
	         
			for(int i = 1; i <= n; i++) {
	            if(n % i == 0) {
	               count++;
	            }
	         }
	         
	         if(count == 2) {
	            System.out.println(n + " is a prime number");
	         } else {
	            System.out.println(n + " is not a prime number");
	         }

	      }
		}
	}


