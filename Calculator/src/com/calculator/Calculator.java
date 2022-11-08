package com.calculator;

import java.util.Scanner;


public class Calculator {
	
	 public static int add(int number1, int number2) {
	      return number1 + number2;
	   }
	 
	   public static int sub(int number1, int number2) {
	      return number1 - number2;
	   }
	 
	   public static int mul(int number1, int number2) {
	      return number1 * number2;
	   }
	 
	   public static int divInt(int number1, int number2) {
	      if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
	      return number1 / number2;
	   }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number1 = 0;
		int number2 = 0;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("Enter the first name: "+ number1);
			number1=scan.nextInt();
			System.out.println("Enter the second number: "+ number2);
			number2=scan.nextInt();
		}
		
		
		int add = Calculator.add(number1, number2);
			System.out.println("Addition of the Two Numbers is " + add);
			
		int sub = Calculator.sub(number1, number2);
		    System.out.println("Subtraction of the Two Numbers is " + sub);
		    	
		int mul = Calculator.mul(number1, number2);
			System.out.println("Multiplication of the Two Numbers is " + mul);
			
		int div = Calculator.divInt(number1, number2);
			System.out.println("Division of the Two Numbers is " + div);
		

	}

}
