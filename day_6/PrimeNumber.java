package com.bridgelabz.assignment.day_6;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args) {
		int temp = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check is Prime or Not ");
		int number = sc.nextInt();
		for(int i = 2; i<number; i++) {
			if(number%i == 0) {
			temp =temp + 1;
			}
			}
		if(temp == 0) {
			System.out.println(number +" is Prime Number");
		}
		else {
			System.out.println(number + " is not Prime Number" );
		}
		}
		

	}


