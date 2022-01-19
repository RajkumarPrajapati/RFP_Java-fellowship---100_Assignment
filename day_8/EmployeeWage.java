package com.bridgelabz.assignment.day_8;

import java.util.Random;

import com.bridgelabz.assignment.day_3.EmpWage_2;

public class EmployeeWage {
	int isPresent;
	int perHourWage = 20;
	float totalWage = 0;
	int workingHour = 0;
	
	Random random = new Random();
	
	public void empMonthlyWage() {
		
		for(int i=1;i<=20;i++) {
			isPresent = random.nextInt(3);
			if(isPresent == 0) {
				System.out.println("Employee is Absant");
				workingHour = 0;
			}
			else if(isPresent == 1) {
				System.out.println("Employee is Present Full Time");
				workingHour = 8;
			}
			else if(isPresent == 2) {
				System.out.println("Employee is Present Part Time");
				workingHour = 8;
			}
			
			int empDailyWage = perHourWage * workingHour;
			totalWage = totalWage + empDailyWage;
		}
		
		System.out.println("Employee Monthly Wage is : "+totalWage);
	}

	public static void main(String[] args) {
		System.out.println("*****************Welcome to Employee Wage Computation**************");
		EmpWage_2 emp = new EmpWage_2();
		emp.empMonthlyWage();

	}
}
