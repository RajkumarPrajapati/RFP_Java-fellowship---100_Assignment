package com.bridgelabz.assignment.day_3;

public class EmployeeWage {
	static int isPresent=(int)Math.round (Math.random());
	static int wagePerHour=20;
	static int fullDayHour = 8;
	static float empDailyWage;
	static float empMonthlyWage;
	
//==========Check Employee is Present or Not=============
	
	public static void checkEmployee() {
		 if(isPresent == 1) {
			System.out.println("Employee is Present");
	    	}
		   else {
			System.out.println("Employee is not Present");
		   }
	}
	
//==========Calculate Employee Daily Wage=============
	
	public static void employeeDailyWage() {
		empDailyWage = wagePerHour*fullDayHour;
		System.out.println("Employee Per Day Wage is : "+empDailyWage);
	}
	
//==========Calculate Employee Monthly Wage=============
	public static void employeeMonthlyWage() {
		empMonthlyWage = 20*empDailyWage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("*****************Welcome to Employee Wage Computation**************");
		System.out.println(isPresent);
		checkEmployee();
		employeeDailyWage();
	}

}
