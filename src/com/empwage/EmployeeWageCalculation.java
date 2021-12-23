package com.empwage;

public class EmployeeWageCalculation {

	public static void main(String[] args) {
		
		Employee Dam = new Employee("Dmart", "Avinash", 8, 20, 20, 80) ;
		int DmartWage = Dam.calculateEmpwage();
	//	System.out.println("employe Wage of Dmart company : " + DmartWage);
		
		System.out.println(Dam.enmpName + " is working with " + Dam.compaName + ", and he is earning "
				+  DmartWage + "$ monthly");

		Employee rILEmp = new Employee("Reliance", "Tony", 9, 15, 25, 80);
		int rILEmpWage = rILEmp.calculateEmpwage();
		System.out.println(rILEmp.enmpName + " is working with " + rILEmp.compaName + ", and he is earning "
				+ rILEmpWage + "$ monthly");
		}

		
	}

