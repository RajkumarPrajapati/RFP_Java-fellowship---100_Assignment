package com.bridgelabz.assignment.day_6;
import java.util.*;
public class ReverseNumber_2 {
    
	public static void main(String[] args) {
		int r;
	    int rev = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Number to Get Reverse of it ");
	int number = sc.nextInt();
	while(number !=0) {
		rev = rev*10+number%10;
		number  = number/10;
	}
	System.out.println("Reverse number is : "+rev);
	

	}

}
