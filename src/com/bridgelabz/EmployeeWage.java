package com.bridgelabz;

public class EmployeeWage {
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int Full_time = 1;
  		int Part_time = 2;
  		
  		int wage_Per_Hrs=20;
  		int empHrs = 0;
  		//int empWage = 0;
 
        int empCheck = (int)Math.floor(Math.random() *10) % 3;
        if ( empCheck == Full_time )
                empHrs=8;
        else if (empCheck == Part_time )
        		empHrs=4;
        int empWage = empHrs * wage_Per_Hrs;
        System.out.println("Emp Wage : " +empWage);
	}

}
