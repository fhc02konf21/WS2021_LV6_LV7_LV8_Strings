package org.campus02.employees;

public class EmployeeDemoApp {
    public static void main(String[] args) {

        EmployeeManager employeeManager = new EmployeeManager();

        employeeManager.addEmployee(
                new FixCommissionEmployee("Susi", "Sorglos", "Finance", 3700, 100));
        employeeManager.addEmployee(
                new PercentCommissionEmployee("Max", "Muster", "HR", 3500, 3));
        employeeManager.addEmployee(
                new Employee("John", "Supermanager", "Finance", 4000));


        System.out.println("Gesamte Lohnkosten: " + employeeManager.getTotalSalary());

        System.out.println(employeeManager.getSalaryByDepartment());

        System.out.println("Durchschnittliche Lohnkosten: " + employeeManager.getAverageSalary());
        System.out.println(employeeManager.getCountInDepartment());




    }
}
