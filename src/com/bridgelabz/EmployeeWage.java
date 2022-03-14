package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
	static final int FULL_TIME= 8;
    static final int PART_TIME= 4;
    int wagePerHrs;
    int workingDay;
    int maxworkingHrs;
    String name;
    int monthlyWage;
    
    void companyMonthlyWage(int monthlyWage) {
 	   this.monthlyWage=monthlyWage;
    }
    
    public EmployeeWage(String name, int wagePerHrs, int workingDay, int maxworkingHrs, int monthlyWage) {
		super();
		this.wagePerHrs = wagePerHrs;
		this.workingDay = workingDay;
		this.maxworkingHrs = maxworkingHrs;
		this.name = name;
		this.monthlyWage = monthlyWage;
	}

	public void employeeAttendance() {
		 int empHrs = 0;
         int monthlyWage = 0;
         int days = 1;
         int hours = 0;
         System.out.println("Company name : "+ name);
         while(days < workingDay && hours < maxworkingHrs) {
         	int empCheck = (int)Math.floor(Math.random() *10) % 3;
         	int remaining_Hours=100-hours;
         	if(remaining_Hours%8<1) {
         		System.out.println(" Employee is present for part time");
         		int partialDailyWage = PART_TIME * wagePerHrs;
         		System.out.println("Daily Wage :Rs."+partialDailyWage);
         		monthlyWage=monthlyWage+partialDailyWage;
         		hours=hours+PART_TIME;
         	}
         	days ++;
         	
         
        
        switch (empCheck) {
        case 1 :
               System.out.println("Employee is Full time presnt");
               int dailyWage = FULL_TIME * wagePerHrs;
               System.out.println("Daily wage : "+dailyWage);
               monthlyWage = monthlyWage + dailyWage;
               hours = hours + FULL_TIME;
               break;
        case 2 :
               System.out.println("Employee is Part time presnt");
               int dailyWage_par = PART_TIME * wagePerHrs;
               System.out.println("Daily wage : "+ dailyWage_par);
               monthlyWage = monthlyWage + dailyWage_par;
               hours = hours+PART_TIME;
               break;
        default :
                System.out.println("Employee not present");
        }  
     } 
         
    
     System.out.println("Monthly Wage : " + monthlyWage);
     System.out.println("Total Hours  : "+hours);
     System.out.println("day  : "+ days);
     System.out.println("-------------------------------------");
         
}
   
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		
		EmployeeWage emp1 = new EmployeeWage("IBM", 40, 20, 200, 30);
		emp1.employeeAttendance();
		EmployeeWage emp2 = new EmployeeWage("HCL", 40, 20, 200, 40);
		emp2.employeeAttendance();
		
		EmpWageBuilder empBuilder = new EmpWageBuilder();
		
		empBuilder.showInfo(emp1);
		empBuilder.addCompany(emp1);
		
		empBuilder.showInfo(emp2);
		empBuilder.addCompany(emp2);
		
		
	}

}
