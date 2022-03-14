package com.bridgelabz;

import java.util.ArrayList;

public class EmpWageBuilder {
	
	private ArrayList<EmployeeWage> companyList = new ArrayList<EmployeeWage>();
	 
	 void showInfo(EmployeeWage EmployeeWage) {
		 System.out.println("Company name: "+EmployeeWage.name);
		 System.out.println("Total Wage :"+EmployeeWage.monthlyWage);
	 }
	 
	 void addCompany(EmployeeWage EmployeeWage) {
		 companyList.add(EmployeeWage);
	 }

}
