package com.bridgelabz.assignment.day_5;
import java.util.Scanner;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year (xxxx) to check Leap year");
		int year = sc.nextInt();
		if(year>1000) {
			if(year%4 == 0) {
				System.out.println(year +" is leap year");
			}
			else {
				System.out.println(year +" is not leap year");
			}
		}
		else{
			System.out.println("Entered Invalid Year it must be 4 digit");
		}
		
	}

}
