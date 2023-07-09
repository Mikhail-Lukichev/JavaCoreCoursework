package OOP;
public class Main {
    public static void main(String[] args) {
        EmployeeBook companyBranch = new EmployeeBook();
        companyBranch.addEmployee(new Employee("David","Jones",1,20000));
        companyBranch.addEmployee(new Employee("Tatiana","Barker",2,18150));
        companyBranch.addEmployee(new Employee("Nicola","Gilmore",1,21000));
        companyBranch.addEmployee(new Employee("Tammy","Aguilar",2,19500));

        System.out.println("Print all employees");
        companyBranch.printEmployees();
        System.out.println();

        System.out.println("Total salary: " + companyBranch.calculateTotalSalary());
        System.out.println("Average salary: " + companyBranch.calculateAverageSalary());
        System.out.println("Lowest Salary employee: " + companyBranch.findLowestSalaryEmployee());
        System.out.println("Highest Salary employee: " + companyBranch.findHighestSalaryEmployee());
        System.out.println();

        companyBranch.printEmployeesList();
        System.out.println();

        System.out.println("Increase salary for all by 20%");
        companyBranch.increaseSalary(20);
        companyBranch.printEmployees();
        System.out.println();

        System.out.println("Lowest Salary employee in department 1: " + companyBranch.findLowestSalaryEmployeeInDepartment(1));
        System.out.println("Highest Salary employee in department 2: " + companyBranch.findHighestSalaryEmployeeInDepartment(2));
        System.out.println("Total salary in department 1: " + companyBranch.calculateTotalSalaryInDepartment(1));
        System.out.println("Average salary in department 1: " + companyBranch.calculateAverageSalaryInDepartment(1));
        System.out.println();

        System.out.println("Increase salary for department 1 by 20%");
        companyBranch.increaseSalaryInDepartment(20,1);
        companyBranch.printEmployeesInDepartment(1);
        System.out.println();

        companyBranch.printEmployeesWithSalaryBelowThreshold(24000);
        companyBranch.printEmployeesWithSalaryAboveThreshold(24000);
        System.out.println();

        System.out.println("Remove employee with id 2");
        companyBranch.removeEmployee(2);
        System.out.println("Print all employees");
        companyBranch.printEmployees();
        System.out.println();

        System.out.println("Remove employee with name Tatiana Barker");
        companyBranch.removeEmployee("Tatiana", "Barker");
        System.out.println("Print all employees");
        companyBranch.printEmployees();
        System.out.println();

        System.out.println("Remove employee with name Tammy Aguilar and id 3");
        companyBranch.removeEmployee("Tammy", "Aguilar",3);
        System.out.println("Print all employees");
        companyBranch.printEmployees();
        System.out.println();

        System.out.println("Add three employees");
        companyBranch.addEmployee(new Employee("Sapphire","Dixon",1,21300));
        companyBranch.addEmployee(new Employee("Gerald","Bright",2,20800));
        companyBranch.addEmployee(new Employee("Mason","Shields",2,17900));
        System.out.println("Print all employees");
        companyBranch.printEmployees();
        System.out.println();

        System.out.println("Set salary 18500 for Mason Shields");
        companyBranch.setSalary("Mason","Shields",18500);
        System.out.println("Print all employees");
        companyBranch.printEmployees();
        System.out.println();

        System.out.println("Set department 5 for Gerald Bright");
        companyBranch.setDepartment("Gerald","Bright",5);
        System.out.println("Print all employees");
        companyBranch.printEmployees();
        System.out.println();

        companyBranch.printEmployeesByDepartment();

    }

}