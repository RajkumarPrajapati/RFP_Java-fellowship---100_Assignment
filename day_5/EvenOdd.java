package com.bridgelabz.assignment.day_5;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check even or odd ");
		int number = sc.nextInt();
		if(number%2 == 0) {
			System.out.println(number+" is Even number");
		}
		else {
			System.out.println(number+" is Odd number");
		}
	}

}
