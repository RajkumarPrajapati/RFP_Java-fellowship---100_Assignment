package com.bridgelabz.assignment.day_6;
import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many coupon you want to generate ");
		int size = sc.nextInt();
		int [] array = new int[size];
		for(int i=0;i<array.length;i++) {
			System.out.println("Enter "+(i+1)+" index Element");
			array[i] = sc.nextInt();
			for(int j=0;j<i;j++) {
				if(array[i]==array[j]) {
					System.out.println("Duplicate Entry Kindy Apply Another Coupon");
					array[i] = sc.nextInt();
				}
			}
		}
		System.out.println("All Unique Coupon is ");
		for(int k =0;k<array.length;k++) {
			System.out.print(" "+array[k]);
		}
	}

}
