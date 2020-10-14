package com.package2;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks (out of 100) -");
		
			System.out.println("subject1 ");
		    int subject1 = sc.nextInt();
		
		   System.out.println("subject2 ");
	    	int subject2 = sc.nextInt();
		
		  System.out.println("subject3 ");
		  int subject3 = sc.nextInt();
		
	     System.out.println("subject4 ");
		 int subject4 = sc.nextInt();
		
		System.out.println("subject5 ");
		int subject5 = sc.nextInt();
		
		
		System.out.println("-----------------------------------------------------------------------");
		
		float percent =(subject1+subject2+subject3+subject4+subject5)/5;
		String grade ;
		if(percent>=90)
		{
			grade = "A";
		}
		else if (percent >=70)
		{
			grade = "B";
		}
		else if (percent >=50)
		{
			grade ="C";
		}
		else if (percent >=35)
		{
			grade = "D";
		}
		else
		{
			grade = "Fail";
		}
		
		System.out.println("Grade - "+grade +", Percentage - "+percent+"%"
				+ "");
		

	}

}
