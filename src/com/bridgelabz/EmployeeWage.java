package com.bridgelabz;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int Full_time = 1;
  		
  		int wage_Per_Hrs=20;
  		int empHrs = 8;
  		//int empWage = 0;
 
        int empCheck = (int)Math.floor(Math.random() *10) % 2;
        if ( empCheck == Full_time )
        {
        	System.out.println("employee present");
        	int empWage = empHrs * wage_Per_Hrs;
        	System.out.println("Emp Wage : " +empWage);
        }		
        else
        {	
             System.out.println("employee not present");
        }
	}

}
