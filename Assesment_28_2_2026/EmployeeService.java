package Assesment_28_2_2026;

import java.time.Year;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeService {

//	1
	public double avgSal() {
		return EmployeeRepository.getEmployees().stream().collect(Collectors.averagingDouble(e -> e.getSalary()));
	}

//	2
//	public Map<String, Double> maxInDept() {
//		Map<String, Double> mpMap = EmployeeRepository.getEmployees().stream()
//				.filter(emp -> emp.getDepartment() != null).collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName(),)));
//		return mpMap;
//	}
	public Map<String, Optional<Employee>> maxInDept() {
		return EmployeeRepository.getEmployees().stream().filter(emp -> emp.getDepartment() != null)
				.collect(Collectors.groupingBy(emp -> emp.getDepartment().getDepartmentName(),
						Collectors.maxBy((x, y) -> Double.compare(x.getSalary(), y.getSalary()))));
	}

//	3
	public Map<String, Double> totalSal() {
		return EmployeeRepository.getEmployees().stream()
				.filter(emp -> emp.getDepartment() != null).collect(Collectors.groupingBy(
						n -> n.getDepartment().getDepartmentName(), Collectors.summingDouble(n -> n.getSalary())));
	}

//	4
	public List<String> empSal() {
		return EmployeeRepository.getEmployees().stream()
				.map(emp -> emp.getFirstName() + " " + emp.getLastName() + ": $" + emp.getSalary())
				.collect(Collectors.toList());
	}

// 5
	public List<Employee> sortedSal() {
		return EmployeeRepository.getEmployees().stream()
				.sorted((x, y) -> Double.compare(y.getSalary(), x.getSalary())).collect(Collectors.toList());
	}
}
