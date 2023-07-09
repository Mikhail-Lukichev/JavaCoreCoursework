package OOP;

import java.util.Arrays;

public class EmployeeBook {
    private Employee[] employees;
    public EmployeeBook() {
        this.employees = new Employee[10];
    }
    public void addEmployee(Employee newEmployee) {
        for (int i = 0; i < this.employees.length; i++){
            if (this.employees[i] == null) {
                this.employees[i] = newEmployee;
                break;
            }
        }
    }

    public void removeEmployee(String firstName, String lastName, int id) {
        for (int i = 0; i < this.employees.length; i++){
            if (this.employees[i] != null && this.employees[i].getFistName() == firstName && this.employees[i].getLastName() == lastName && this.employees[i].getEmployeeId() == id) {
                this.employees[i] = null;
                break;
            }
        }
    }
    public void removeEmployee(int id) {
        for (int i = 0; i < this.employees.length; i++){
            if (this.employees[i] != null && this.employees[i].getEmployeeId() == id) {
                this.employees[i] = null;
                break;
            }
        }
    }
    public void removeEmployee(String firstName, String lastName) {
        for (int i = 0; i < this.employees.length; i++){
            if (this.employees[i] != null && this.employees[i].getFistName() == firstName && this.employees[i].getLastName() == lastName) {
                this.employees[i] = null;
                break;
            }
        }
    }

    public void setSalary(String firstName, String lastName, int salary){
        for (Employee employee: this.employees){
            if (employee != null && employee.getFistName() == firstName && employee.getLastName() == lastName) {
                employee.setSalary(salary);
                break;
            }
        }
    }

    public void setDepartment(String firstName, String lastName, int department){
        for (Employee employee: this.employees){
            if (employee != null && employee.getFistName() == firstName && employee.getLastName() == lastName) {
                employee.setDepartment(department);
                break;
            }
        }
    }

    public void printEmployees() {
        for (Employee employee : this.employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public void printEmployeesByDepartment() {
        int[] departments = new int[99];
        Boolean departmentFound;
        int departmentsCount = 0;
        for (Employee employee: this.employees){
            if (employee != null ) {
                departmentFound = false;
                for (int i = 0; i < departmentsCount;i++) {
                    if (departments[i] == employee.getDepartment()){
                        departmentFound = true;
                    }
                }
                if (departmentFound == false) {
                    departments[departmentsCount] = employee.getDepartment();
                    departmentsCount++;
                }
            }
        }
        Arrays.sort(departments,0,departmentsCount);
        for (int i = 0; i < departmentsCount;i++) {
            System.out.println("Department " + departments[i] + " employees:");
            for (Employee employee: this.employees) {
                if (employee != null && employee.getDepartment()==departments[i]) {
                    System.out.println(employee.getFistName() + " " + employee.getLastName());
                }
            }
        }

    }
    public int calculateTotalSalary() {
        int total = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                total = total + employee.getSalary();
            }
        }
        return total;
    }

    public double calculateAverageSalary() {
        int count = 0;
        for (Employee employee : this.employees) {
            if (employee != null) {
                count++;
            }
        }
        return (double) this.calculateTotalSalary() / count;
    }

    public Employee findLowestSalaryEmployee(){
        int salary = Integer.MAX_VALUE;
        Employee lowestSalaryEmployee = null;
        for (Employee employee : this.employees) {
            if (employee != null && employee.getSalary() < salary) {
                salary = employee.getSalary();
                lowestSalaryEmployee = employee;
            }
        }
        return lowestSalaryEmployee;
    }

    public Employee findHighestSalaryEmployee(){
        int salary = Integer.MIN_VALUE;
        Employee highestSalaryEmployee = null;
        for (Employee employee : this.employees) {
            if (employee != null && employee.getSalary() > salary) {
                salary = employee.getSalary();
                highestSalaryEmployee = employee;
            }
        }
        return highestSalaryEmployee;
    }

    public void printEmployeesList(){
        System.out.println("List of employees:");
        for (Employee employee : this.employees) {
            if (employee != null) {
                System.out.println(employee.getFistName() + " " + employee.getLastName());
            }
        }
    }

    public void increaseSalary(int perc){
        double newSalary;
        for (Employee employee : this.employees) {
            if (employee != null) {
                newSalary = employee.getSalary() * (1 + ((double) perc / 100));
                employee.setSalary((int)newSalary);
            }
        }
    }

    public Employee findLowestSalaryEmployeeInDepartment(int department){
        int salary = Integer.MAX_VALUE;
        Employee lowestSalaryEmployee = null;
        for (Employee employee : this.employees) {
            if (employee != null && employee.getSalary() < salary && department == employee.getDepartment()) {
                salary = employee.getSalary();
                lowestSalaryEmployee = employee;
            }
        }
        return lowestSalaryEmployee;
    }

    public Employee findHighestSalaryEmployeeInDepartment(int department){
        int salary = Integer.MIN_VALUE;
        Employee highestSalaryEmployee = null;
        for (Employee employee : this.employees) {
            if (employee != null && employee.getSalary() > salary && department == employee.getDepartment()) {
                salary = employee.getSalary();
                highestSalaryEmployee = employee;
            }
        }
        return highestSalaryEmployee;
    }

    public int calculateTotalSalaryInDepartment(int department) {
        int total = 0;
        for (Employee employee : this.employees) {
            if (employee != null && department == employee.getDepartment()) {
                total = total + employee.getSalary();
            }
        }
        return total;
    }

    public double calculateAverageSalaryInDepartment(int department) {
        int count = 0;
        for (Employee employee : this.employees) {
            if (employee != null && department == employee.getDepartment()) {
                count++;
            }
        }
        return (double) this.calculateTotalSalaryInDepartment(department) / count;
    }

    public void increaseSalaryInDepartment(int perc, int department){
        double newSalary;
        for (Employee employee : this.employees) {
            if (employee != null && department == employee.getDepartment()) {
                newSalary = employee.getSalary() * (1 + ((double) perc / 100));
                employee.setSalary((int)newSalary);
            }
        }
    }

    public void printEmployeesInDepartment(int department) {
        System.out.println("Employees in department " + department + ":");
        for (Employee employee : this.employees) {
            if (employee != null && department == employee.getDepartment()) {
                System.out.println( "Name: " +
                        employee.getFistName() + " " +
                        employee.getLastName() + "; Salary: " +
                        employee.getSalary() + ";");
            }
        }
    }

    public void printEmployeesWithSalaryBelowThreshold(int salary) {
        System.out.println("Employees with salary below " + salary + ":");
        for (Employee employee : this.employees) {
            if (employee != null && employee.getSalary()<salary) {
                System.out.println("employeeID: " +
                        employee.getEmployeeId() + "; Name " +
                        employee.getFistName() + " " +
                        employee.getLastName() + "; Salary: " +
                        employee.getSalary() + ";");
            }
        }
    }

    public void printEmployeesWithSalaryAboveThreshold(int salary) {
        System.out.println("Employees with salary above or equal " + salary + ":");
        for (Employee employee : this.employees) {
            if (employee != null && employee.getSalary()>=salary) {
                System.out.println( "employeeID: " +
                        employee.getEmployeeId() + "; Name " +
                        employee.getFistName() + " " +
                        employee.getLastName() + "; Salary: " +
                        employee.getSalary() + ";");
            }
        }
    }
}
