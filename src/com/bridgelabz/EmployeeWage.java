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
         int hours=0;
        while(days<=20 && hours<100) {
       	   
        int empCheck = (int)Math.floor(Math.random() *10) % 3;
        int remaining_Hours=100-hours;
		 if(remaining_Hours%8<1) {
			System.out.println(" Employee is present for part time");
			int partialDailyWage=PART_TIME * WAGE_PER_HRS;
			System.out.println("Daily Wage :Rs."+partialDailyWage);
			monthlyWage=monthlyWage+partialDailyWage;
			hours=hours+PART_TIME;
		}
        switch (empCheck) {
        case 1 :
               System.out.println("Employee is Full time presnt");
               int dailyWage = FULL_TIME * WAGE_PER_HRS;
               System.out.println("Daily wage : "+dailyWage);
               monthlyWage = monthlyWage + dailyWage;
               hours=hours+FULL_TIME;
               break;
        case 2 :
               System.out.println("Employee is Part time presnt");
               int dailyWage_par = PART_TIME * WAGE_PER_HRS;
               System.out.println("Daily wage : "+ dailyWage_par);
               monthlyWage = monthlyWage + dailyWage_par;
               hours=hours+PART_TIME;
               break;
        default :
                System.out.println("Employee not present");
       }
       days ++;
    }
     System.out.println("Monthly Wage : " + monthlyWage);
     System.out.println("Total Hours  : "+hours);
     System.out.println("Total days  : "+ days);
	}

}
