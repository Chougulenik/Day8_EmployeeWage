package com.bridgelabz;

import java.util.ArrayList;

interface CompanyCollection {
	
	void showInfo(Company company);
	void addCompany(Company company);
}

public class EmpWageBuilder implements CompanyCollection {
	
	static ArrayList<Company> listOfCompany = new ArrayList<Company>();
	
	@Override
	public void showInfo(Company company) {
		System.out.println("Company name: " + company.name);
		System.out.println("Total Wage :" + company.monthlyWage);
	}
	
	@Override
	public void addCompany(Company company) {
		for (Company elements : listOfCompany) {
			if (elements.name.equals(company.name)) {
				listOfCompany.remove(elements);
			}
		}
	}

	public void totalWage(String name) {
		for (Company elements : listOfCompany) {
			if (elements.name.equals(name)) {
				System.out.println("Total Wage of company :" + elements.monthlyWage);
			}
		}
	}

}
