package com.bridgelabz;

public class Company {
	String name;
	int wagePerHrs;
	int workingDays;
	int workingHoursMonthly;
	int monthlyWage;	
	
	void setInfo(String name,int wagePerHrs,int workingDays, int workingHoursMonthly) {
		 this.name = name;
		 this.wagePerHrs = wagePerHrs;
		 this.workingDays = workingDays;
		 this.workingHoursMonthly = workingHoursMonthly;
			   
	}
		   
	void companyMonthlyWage(int monthlyWage) {
		this.monthlyWage=monthlyWage;
	}
	
}
