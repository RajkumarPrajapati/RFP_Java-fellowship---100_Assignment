package com.bridgelabz.assignment.day_5;
import java.util.Scanner;
public class VovelConsonant {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char to get Vovel or Consonant ");
		String ch = sc.next().toLowerCase();
		char c =ch.charAt(0);
		switch (c) {
		case 'a' :{
			System.out.println(c+" is Vovel");
			break;
		}
		case 'e' :{
			System.out.println(c+" is Vovel");
			break;
		}
		case 'i' :{
			System.out.println(c+" is Vovel");
			break;
		}
		case 'o' :{
			System.out.println(c+" is Vovel");
			break;
		}
		case 'u' :{
			System.out.println(c+"is Vovel");
			break;
		}
		default :{
			System.out.println(c+" is Consonant");
		}
		}
		
		}

	}


