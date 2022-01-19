package com.bridgelabz.assignment.day_5;
import java.util.Scanner;
public class PrimeFactor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to get Prime Factors ");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++) {
			if(number%i==0) {
			System.out.print(" "+i+",");
			}	
		}
	}

}
