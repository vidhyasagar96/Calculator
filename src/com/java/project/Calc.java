package com.java.project;

import java.util.Scanner;

public class Calc {
	
	public static void main (String [] args) {
		
		char op;
		double num1, num2, result;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please select the operation: + , -  , / , * ");
		op = input.next().charAt(0);
		   
		System.out.println("Enter first number :");
		num1 = input.nextDouble();
		   
		System.out.println("Enter second number :");
	    num2 = input.nextDouble();
		   
		 switch (op) {
		 
		  case('+'):
	          result = num1 + num2;
		      System.out.println(num1 + " + " + num2 + " = " + result);
		      break;
		   
		  case ('-'):
		      result = num1 - num2;
		      System.out.println(num1 + " - " + num2 + " = " + result);
		      break;
		      
		  case ('/'):
			  result = num1 / num2;
		      System.out.println(num1 + " / " + num2 + " = " + result);
		      break;
		      
		  case ('*'):
			  result = num1 * num2;
		      System.out.println(num1 + " * " + num2 + " = " + result);
		      break;
		      
		  default:
		      System.out.println("Invalid operation");
		      break;
		 }
		 
	}

}
