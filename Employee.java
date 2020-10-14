package com.package2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Employee {
	String name;
	int dayOfBirth;
	int monthOfBirth;
	int birthYear;
	long monthlyIncome;
	
	//long tax;
	
	long annualIncome()
	{
		return monthlyIncome*12;
	}
	
	String age() 
	{
		LocalDate today = LocalDate.now();
		LocalDate birth = LocalDate.of(birthYear, monthOfBirth, dayOfBirth);
		
		int years = Period.between(birth, today).getYears();
		int month = Period.between(birth, today).getMonths();
		int days = Period.between(birth, today).getDays();
		
		String age = (years +" years "+month+" months "+days+" days old");
		
		return age;
	}
	
	void tax() 
	{
		
		
		if (annualIncome()>=500000)
		{
			System.out.println("Tax - "+(annualIncome()*0.2) +" (20% of Annual Income)");
		}
		else if (annualIncome()>=400000)
		{
			System.out.println("Tax - "+(annualIncome()*0.15) +" (15% of Annual Income)");
		}
		else if (annualIncome()>=300000)
		{
			System.out.println("Tax - "+(annualIncome()*0.10) +" (10% of Annual Income)");
		}
		else if (annualIncome()>=200000)
		{
			System.out.println("Tax - "+(annualIncome()*0.05) +" (05% of Annual Income)");
		}
		else
		{
			System.out.println("Tax - "+(annualIncome()*0) + " (Income is below 2L)");
		}
	}
	void display()
	{
		System.out.println("=====================================================");
		System.out.println("The Employee Name is "+name+".");
		System.out.println("Age - "+age()+".");
		System.out.println("Annual Income - " + annualIncome());
		tax();
	}
	

}
