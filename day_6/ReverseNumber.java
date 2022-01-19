package com.bridgelabz.assignment.day_6;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to get Reverse ");
		int number  = sc.nextInt();
		String str = String.valueOf(number);
		String rev=" ";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		//int r =Integer.valueOf(rev);
		System.out.println("Reverse is : "+rev);

	}

}
