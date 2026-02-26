package StreamsCaseStudy;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeService emp = new EmployeeService();
		System.out.println("SUM OF SALARY: "+emp.sumOfSal());
		System.out.println("Map of dept count: "+emp.deptCount());
		
		System.out.println("Senior most employee: "+ emp.seniorEmp());
		System.out.println(emp.empWithoutDept());
		emp.duration();
		
		
	}
}
