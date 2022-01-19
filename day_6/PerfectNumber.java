package com.bridgelabz.assignment.day_6;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get Perfect Number ");
		int number = sc.nextInt();
		System.out.print("Divisors of "+number+" : ");
		for(int i = 1; i<number;i++) {
			if(number%i == 0) {
				sum = sum+i;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		if(sum == number) {
			System.out.println(number+" = "+sum);
		}
		else {
			System.out.println(number+" != "+sum);
		}
		}
	}


