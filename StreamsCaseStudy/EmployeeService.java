package StreamsCaseStudy;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeService {
//	1
	public double sumOfSal() {
		double sum = EmployeeRepository.getEmployees().stream().collect(Collectors.summingDouble(e -> e.getSalary()));
		return sum;
	}

//	2
	public Map<String, Long> deptCount() {
		Map<String, Long> mp = EmployeeRepository.getEmployees().stream().filter(n -> n.getDepartment() != null)
				.collect(Collectors.groupingBy(n -> n.getDepartment().getDepartmentName(), Collectors.counting()));
//		for (Map.Entry<Object, Long> entry : mp.entrySet()) {
//			Department key =(Department) entry.getKey();
//			Long val = entry.getValue();
//			System.out.println(key.getDepartmentName() + " : "+ val);
//		}
		return mp;
	}

//	3
	public String seniorEmp() {
		String employee = EmployeeRepository.getEmployees().stream()
				.min((x, y) -> x.getHireDate().compareTo(y.getHireDate())).get().getFirstName();
		System.out.println(employee);
		return employee;
	}

//	4
	public String Diff(LocalDate a, LocalDate b) {
		Period period = Period.between(a, b);
		String totalMonthString = ""+period.getMonths()+(period.getYears()*12) ;
		return period.getDays() + "Days - " + totalMonthString  + "Months ";
	}

	public Map<Object, String> duration() {
		Map<Object, String> mpMap = EmployeeRepository.getEmployees().stream()
				.collect(Collectors.toMap(n -> n.getFirstName(), n -> Diff(n.getHireDate(), LocalDate.now())));
		System.out.println(mpMap);
		return mpMap;
	}

//  5
	public ArrayList<Employee> empWithoutDept() {
		ArrayList<Employee> list = (ArrayList<Employee>) EmployeeRepository.getEmployees().stream()
				.filter(e -> e.getDepartment() != null).collect(Collectors.toList());
		return list;
	}
	
//	6
	

}
