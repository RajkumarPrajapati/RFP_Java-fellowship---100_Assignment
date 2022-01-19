package com.bridgelabz.assignment.day_6;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		int n1 = 0;
		int n2 = 1;
		int n3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number till get Fibonacci Series ");
		int number = sc.nextInt();
		System.out.print(n1 + " " + n2);
		for (int i = 0; i <= number; i++) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}

}
