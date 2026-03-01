package StreamsPracticeOnEmployees;

public class Employee {

    private int id;
    private String name;
    private String department;
    private String jobTitle;
    private int age;
    private int yearsOfExperience;
    private double salary;
    private int performanceRating;

    // No-args constructor
    public Employee() {
    }

    // All-args constructor
    public Employee(int id, String name, String department, String jobTitle,
                    int age, int yearsOfExperience, double salary, int performanceRating) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.jobTitle = jobTitle;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.salary = salary;
        this.performanceRating = performanceRating;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getAge() {
        return age;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public int getPerformanceRating() {
        return performanceRating;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setPerformanceRating(int performanceRating) {
        this.performanceRating = performanceRating;
    }

    // toString (useful for debugging)
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", yearsOfExperience=" + yearsOfExperience +
                ", salary=" + salary +
                ", performanceRating=" + performanceRating +
                '}';
    }
}
