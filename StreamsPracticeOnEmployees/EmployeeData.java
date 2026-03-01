package StreamsPracticeOnEmployees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {

    public static List<Employee> getEmployees() {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1, "Amit", "IT", "Developer", 25, 2, 95000, 8));
        list.add(new Employee(2, "Ravi", "HR", "Manager", 35, 8, 60000, 5));
        list.add(new Employee(3, "Neha", "Finance", "Analyst", 30, 4, 70000, 7));
        list.add(new Employee(4, "Pooja", "IT", "Developer", 29, 5, 85000, 9));
        list.add(new Employee(5, "Karan", "HR", "Executive", 40, 7, 55000, 6));
        list.add(new Employee(6, "Ankit", "Support", "Engineer", 32, 6, 72000, 8));

        return list;
    }
}
