package com.bridgelabz.assignment.day_5;
import java.util.Scanner;
public class TableOfPowerTwo {

	public static void main(String[] args) {
		int n = 2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number till get Table power of Two");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++) {
		int	table = (int) Math.pow(n,i);
		System.out.print(table+" ");
		}

	}

}
