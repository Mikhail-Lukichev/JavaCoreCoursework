import java.util.Objects;

public class Employee {
    public static int count = 0;
    private int employeeId;
    private String fistName;
    private String lastName;
    private int department;
    private int salary;
    
    public Employee(String firstName, String lastName, int department, int salary){
        this.employeeId = count;
        this.fistName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
        count++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && Objects.equals(fistName, employee.fistName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fistName, lastName, department, salary);
    }
}
