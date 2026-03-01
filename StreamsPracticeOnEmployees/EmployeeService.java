package StreamsPracticeOnEmployees;

import java.util.Collection;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeService {

//	Task 1: Implement a program that reads a list of Employee objects from the user 
//	and performs the following operations: Filter out all employees who are Developers and have a salary greater than 90,000 but have less than 4 years of experience. Sort the remaining employees in ascending order of their age and then by their performance ratings in descending order. 
//	Return a new list containing the names of the remaining employees in uppercase and append "_DEV" to each name.

	public List<String> Task1() {
		return EmployeeData.getEmployees().stream().filter(
				n -> !(n.getJobTitle().equals("Developer") && n.getSalary() > 90000 && n.getYearsOfExperience() < 4))
				.sorted((x, y) -> {
					if (x.getAge() != y.getAge()) {
						return Integer.compare(x.getAge(), y.getAge());
					} else {
						return Integer.compare(y.getPerformanceRating(), x.getPerformanceRating());
					}
				}).map(n -> n.getName().toUpperCase() + "_DEV").collect(Collectors.toList());
	}

	
//	Task 2: Create a program that takes a list of Employee objects as input and performs the following 
//	operations: Filter out all employees from HR department whose performance rating is less than 6 but have more than 6 years of experience and salary
//	between 50,000 and 1,20,000. Sort the remaining employees in descending order of their salary and then by their years of experience in ascending order. Return a new list containing the reversed 
//	names of the 
//	remaining employees.
	
	public List<String> Task2() {
		return EmployeeData.getEmployees().stream()
				.filter(n -> (n.getDepartment().equals("HR") && n.getPerformanceRating() < 6
						&& n.getYearsOfExperience() > 6 && n.getSalary() >= 50000 && n.getSalary() < 120000))
				.sorted((x, y) -> {
					if (x.getSalary() != y.getSalary()) {
						return Double.compare(y.getSalary(), x.getSalary());
					} else {
						return Integer.compare(x.getYearsOfExperience(), y.getYearsOfExperience());
					}
				}).map(n -> new StringBuilder(n.getName()).reverse().toString()).collect(Collectors.toList());
	}
	
	public List<Integer> Task3(){
		return EmployeeData.getEmployees().stream().filter(n-> !(n.getDepartment().length()>5 && n.getAge()>=28 && n.getAge()<=45 && n.getSalary()<75000)).sorted((x,y)->{
			if(x.getPerformanceRating()!=y.getPerformanceRating()) {
				return y.getPerformanceRating() - x.getPerformanceRating();
			}else {
				return x.getName().compareTo(y.getName());
			}
		}).map(n->n.getId()*5).collect(Collectors.toList());
	}
}
