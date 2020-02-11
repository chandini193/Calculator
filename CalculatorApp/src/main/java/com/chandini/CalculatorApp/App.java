package com.chandini.CalculatorApp;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner inp = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String c = "Y";
    	while(c.equals("Y")){
        	System.out.println("1. Addition");
        	System.out.println("2. Subtraction");
        	System.out.println("3. Multiplication");
        	System.out.println("4. Division");
        	System.out.println("Select operation to perform: ");
        	int option = inp.nextInt();
        	System.out.print("Enter first number : ");
        	int num1 = inp.nextInt();
        	System.out.print("\nEnter second number : ");
        	int num2 = inp.nextInt();
        	switch(option){
        	case 1:
        		System.out.println("Sum of "+ num1 +", "+num2+" = "+calculator.add(num1, num2));
        		break;
        	case 2:
        		System.out.println("Difference of "+ num1 +", "+num2+" = "+calculator.subtract(num1, num2));
        		break;
        	case 3:
        		System.out.println("Product of "+ num1 +", "+num2+" = "+calculator.multiply(num1, num2));
        		break;
        	case 4:
        		try{
        			System.out.println("Division of "+ num1 +", "+num2+" = "+calculator.divide(num1, num2));
        		}
        		catch(ArithmeticException e){
        			System.out.println("Divisor can't be zero!");
        		}
        		
        		break;
        	default:
        		System.out.println("Invalid choice...");
        	}
        	System.out.println("Do you want to continue[Y or N]? : ");
        	c = inp.next().toUpperCase();
        }
    }
}
