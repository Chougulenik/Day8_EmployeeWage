package com.bridgelabz;

public class EmployeeWage {
	static final int FULL_TIME= 8;
	static final int PART_TIME= 4;
	static final int WAGE_PER_HRS =20;
	static final int WORKING_DAY =20;
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		int empHrs = 0;
  		int monthlyWage = 0;
  		int days=1;
  		while(days<=20) {
        int empCheck = (int)Math.floor(Math.random() *10) % 3;
        switch (empCheck) {
        case 1 :
        		System.out.println("Employee is Full time presnt");
        		int dailyWage = FULL_TIME * WAGE_PER_HRS;
                System.out.println("Daily wage : "+dailyWage);
                monthlyWage = monthlyWage + dailyWage; 
                break;
        case 2 :
        	  	System.out.println("Employee is Part time presnt");
        	  	int dailyWage_par = PART_TIME * WAGE_PER_HRS;
        	  	System.out.println("Daily wage : "+ dailyWage_par);
        	  	monthlyWage = monthlyWage + dailyWage_par; 
        	  	break;
        default :
        		System.out.println("Employee not present");
        }		
        days ++;
  		}
  		System.out.println("Monthly Wage : " + monthlyWage);
	}

}
