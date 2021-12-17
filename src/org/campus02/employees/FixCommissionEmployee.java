package org.campus02.employees;

public class FixCommissionEmployee extends Employee {

    private double additionalCommission;

    public FixCommissionEmployee(String firstname, String lastname,
                                 String department, double baseSalary,
                                 double additionalCommission) {
        super(firstname, lastname, department, baseSalary);

        this.additionalCommission = additionalCommission;
    }

    @Override
    public double getFullSalary() {
        //return baseSalary + additionalCommission;
        return super.getFullSalary() + additionalCommission;
    }
}
