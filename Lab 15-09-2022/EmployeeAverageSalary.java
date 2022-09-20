public class EmployeeAverageSalary {

	public static void main(String[] args) {
		int avg_salary = 10000; // Average salary of three employees in a week
		int emp1 = 11000, emp2 = 5000; // This are the two given employee salary
		double emp3;
		
		// Displaying the given details
		System.out.println("The total average salary of employees in a week is Rs." + avg_salary);
		System.out.println("Salary of first employee is  Rs. " + emp1);
		System.out.println("Salary of second employee is  Rs. " + emp2);
		System.out.println("Calculating third employee salary...");
		System.out.println();
		
		emp3 = (avg_salary * 3) - (emp1 + emp2); // Formula to calculate the salary of third employee
		System.out.print("Salary of third employee will be Rs." + emp3); // Salary of third employee
	}
}
