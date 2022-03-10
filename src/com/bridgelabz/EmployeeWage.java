package com.bridgelabz;

public class EmployeeWage {
	static final int FULL_TIME= 8;
    static final int PART_TIME= 4;
    public static void employeeAttendance(String name, int wagePerHrs, int workingDay, int maxworkingHrs) {
		 int empHrs = 0;
         int monthlyWage = 0;
         int days=1;
         int hours=0;
         System.out.println("Company name : "+ name);
         int empCheck = (int)Math.floor(Math.random() *10) % 3;
        switch (empCheck) {
        case 1 :
               System.out.println("Employee is Full time presnt");
               int dailyWage = FULL_TIME * wagePerHrs;
               System.out.println("Daily wage : "+dailyWage);
               monthlyWage = monthlyWage + dailyWage;
               hours=hours+FULL_TIME;
               break;
        case 2 :
               System.out.println("Employee is Part time presnt");
               int dailyWage_par = PART_TIME * wagePerHrs;
               System.out.println("Daily wage : "+ dailyWage_par);
               monthlyWage = monthlyWage + dailyWage_par;
               hours=hours+PART_TIME;
               break;
        default :
                System.out.println("Employee not present");
       
    }
     System.out.println("Monthly Wage : " + monthlyWage);
     System.out.println("Total Hours  : "+hours);
     System.out.println("day  : "+ days);
     System.out.println("-------------------------------------");
}
    public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation");
		EmployeeWage.employeeAttendance("IBM", 40, 20, 200);
		EmployeeWage.employeeAttendance("HCL", 50, 15, 300);
	}

}
