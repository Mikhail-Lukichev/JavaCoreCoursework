public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];
        employees[0] = new Employee("David","Jones",1,20000);
        employees[1] = new Employee("Tatiana","Barker",2,18150);
        employees[2] = new Employee("Nicola","Gilmore",1,21000);
        employees[3] = new Employee("Tammy","Aguilar",2,19500);
//        printEmployees(employees);
//        System.out.println("Total salary: " + calculateTotalSalary(employees));
//        System.out.println("Average salary: " + calculateAverageSalary(employees));
//        System.out.println("Lowest Salary employee: " + findLowestSalaryEmployee(employees));
//        System.out.println("Highest Salary employee: " + findHighestSalaryEmployee(employees));
//        printEmployeesList(employees);
//        increaseSalary(employees,5);
//        System.out.println("Lowest Salary employee in department 1: " + findLowestSalaryEmployeeInDepartment(employees,1));
//        System.out.println("Highest Salary employee in department 2: " + findHighestSalaryEmployeeInDepartment(employees,2));
//        System.out.println("Total salary in department 1: " + calculateTotalSalaryInDepartment(employees,1));
//        System.out.println("Average salary in department 1: " + calculateAverageSalaryInDepartment(employees,1));
//        increaseSalaryInDepartment(employees,20,1);
//        printEmployees(employees);
//        printEmployeesInDepartment(employees,1);
//        printEmployeesWithSalaryBelowThreshold(employees,19700);
        printEmployeesWithSalaryAboveThreshold(employees,19700);
    }
    public static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }
    public static int calculateTotalSalary(Employee[] employees) {
        int total = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                total = total + employee.getSalary();
            }
        }
        return total;
    }
    public static Employee findLowestSalaryEmployee(Employee[] employees){
        int salary = Integer.MAX_VALUE;
        Employee lowestSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary) {
                salary = employee.getSalary();
                lowestSalaryEmployee = employee;
            }
        }
        return lowestSalaryEmployee;
    }
    public static Employee findHighestSalaryEmployee(Employee[] employees){
        int salary = Integer.MIN_VALUE;
        Employee highestSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salary) {
                salary = employee.getSalary();
                highestSalaryEmployee = employee;
            }
        }
        return highestSalaryEmployee;
    }
    public static double calculateAverageSalary(Employee[] employees) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                count++;
            }
        }
        return (double) calculateTotalSalary(employees) / count;
    }
    public static void printEmployeesList(Employee[] employees){
        System.out.println("List of employees:");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFistName() + " " + employee.getLastName());
            }
        }
    }
    public static void increaseSalary(Employee[] employees,int perc){
        double newSalary;
        for (Employee employee : employees) {
            if (employee != null) {
                newSalary = employee.getSalary() * (1 + ((double) perc / 100));
                employee.setSalary((int)newSalary);
            }
        }
    }
    public static Employee findLowestSalaryEmployeeInDepartment(Employee[] employees,int department){
        int salary = Integer.MAX_VALUE;
        Employee lowestSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < salary && department == employee.getDepartment()) {
                salary = employee.getSalary();
                lowestSalaryEmployee = employee;
            }
        }
        return lowestSalaryEmployee;
    }
    public static Employee findHighestSalaryEmployeeInDepartment(Employee[] employees, int department){
        int salary = Integer.MIN_VALUE;
        Employee highestSalaryEmployee = null;
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > salary && department == employee.getDepartment()) {
                salary = employee.getSalary();
                highestSalaryEmployee = employee;
            }
        }
        return highestSalaryEmployee;
    }
    public static int calculateTotalSalaryInDepartment(Employee[] employees, int department) {
        int total = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                total = total + employee.getSalary();
            }
        }
        return total;
    }
    public static double calculateAverageSalaryInDepartment(Employee[] employees,int department) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                count++;
            }
        }
        return (double) calculateTotalSalaryInDepartment(employees,department) / count;
    }
    public static void increaseSalaryInDepartment(Employee[] employees,int perc, int department){
        double newSalary;
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                newSalary = employee.getSalary() * (1 + ((double) perc / 100));
                employee.setSalary((int)newSalary);
            }
        }
    }
    public static void printEmployeesInDepartment(Employee[] employees, int department) {
        System.out.println("Employees in department " + department + ":");
        for (Employee employee : employees) {
            if (employee != null && department == employee.getDepartment()) {
                System.out.println( "Name: " +
                                    employee.getFistName() + " " +
                                    employee.getLastName() + "; Salary: " +
                                    employee.getSalary() + ";");
            }
        }
    }
    public static void printEmployeesWithSalaryBelowThreshold(Employee[] employees,int salary) {
        System.out.println("Employees with salary below " + salary + ":");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary()<salary) {
                System.out.println("employeeID: " +
                                    employee.getEmployeeId() + "; Name " +
                                    employee.getFistName() + " " +
                                    employee.getLastName() + "; Salary: " +
                                    employee.getSalary() + ";");
            }
        }
    }
    public static void printEmployeesWithSalaryAboveThreshold(Employee[] employees,int salary) {
        System.out.println("Employees with salary above or equal " + salary + ":");
        for (Employee employee : employees) {
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