package com.package2;


import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		
		System.out.print("Enter Employee Name - ");
		e1.name = sc.nextLine();
		System.out.print("Enter Date of Birth- ");
		e1.dayOfBirth = sc.nextInt();
		System.out.print("Enter Month of Birth - ");
		e1.monthOfBirth = sc.nextInt();
		System.out.print("Enter Year of Birth - ");
		e1.birthYear = sc.nextInt();
		System.out.print("Enter Monthly Income - ");
		e1.monthlyIncome = sc.nextLong();
		
		e1.display();
		
		
		


	}

}
