package com.bridgelabz.assignment.day_3;

import java.util.Random;

public class EmpWage {
	
	int isPresent;
	int workingHour = 0;
	float totalWage = 0;
	int perHourWage = 20;
	
	Random random = new Random();
	
	public void empMonthlyWage() {
		for(int i=1;i<=20;i++) {
		isPresent = random.nextInt(3);
		//System.out.println(isPresent);
		switch(isPresent) {
		       
		case 0 :{
			System.out.println("Employee is on Leave");
			workingHour = 0;
			break;
		}
		case 1 :{
			System.out.println("Employee is Present Full Time");
			workingHour = 8; 
			break;
		}
		case 2 :{
			System.out.println("Employee is Present Part Time");
			workingHour = 8;
		}
		
		
		     }
		
		int EmpDailyWage = perHourWage * workingHour;
		totalWage = totalWage + EmpDailyWage;
		
		
		}
		System.out.println("Employee Monthly Wage is : "+totalWage);
	}

	public static void main(String[] args) {
		System.out.println("*****************Welcome to Employee Wage Computation**************");
		EmpWage eWage = new EmpWage();
		eWage.empMonthlyWage();
		

	}

}
