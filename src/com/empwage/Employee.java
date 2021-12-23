package com.empwage;

public class Employee {
		
		String enmpName;
		String compaName;
		
		int workingHour;
		int wagePerHour;
		int maxWorkingDay;
		int maxWorkingHour;
		public Employee(String empName, String compaName, int workingHour, int wagePerHour, int maxWorkingDay,
				int maxWorkingHour) {
			this.enmpName = empName;
			this.compaName = compaName;
			this.workingHour = workingHour;
			this.wagePerHour = wagePerHour;
			this.maxWorkingDay = maxWorkingDay;
			this.maxWorkingHour = maxWorkingHour;
		}


		static final int IS_PRESENT = 1;
		static final int IS_PART_TIME = 2;

	private int isEmpPresent() {
		return (int) (Math.floor(Math.random() * 10) % 3);
		
	}
	
	private int getWorkingHour(int attendance) {
		int empHr;
		switch (attendance) {
		case IS_PRESENT:
			empHr = workingHour;
			break;
		case IS_PART_TIME:
			empHr = workingHour / 2;
			break;
			
		default:
			empHr = 0;
			break;
		}
		return empHr;
		}

	public int calculateEmpwage() {
	int day =0 ;
	int totalWorkingHour = 0;
	while (day < maxWorkingDay && (totalWorkingHour + workingHour) <= maxWorkingHour) {
		day++;
		int workingHour = getWorkingHour(isEmpPresent());
		totalWorkingHour += workingHour;
	}
	int totalSalary = totalWorkingHour * wagePerHour;
	return totalSalary;
	
		
	}
	
}

