package com.bridgelabz.assignment.day_5;
import java.util.Scanner;
public class SwapTwoNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number a");
		int a = sc.nextInt();
		System.out.println("Enter second number b");
		int b = sc.nextInt();
		int c = a;
		a=b;
		b=c;
		
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);
	}

}
