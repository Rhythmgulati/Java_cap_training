package Assesment_28_2_2026;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeService emp = new EmployeeService();
//		1.
		System.out.println("AVERAGE: \n" + emp.avgSal());
//      2.
		System.out.println("Department and the maximum salary: \n" + emp.maxInDept());
//		3.
		System.out.println("Total Salary per Department: \n" + emp.totalSal());
//		4.
		System.out.println("Employee name and salary: \n" + emp.empSal());
//		5.
		System.out.println("Sorted salary: \n" + emp.sortedSal());
	}
}
