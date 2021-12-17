package org.campus02.employees;

public class PercentCommissionEmployee extends Employee {
    private double percentCommission;

    public PercentCommissionEmployee(String firstname, String lastname,
                                     String department, double baseSalary, double percentCommission) {
        super(firstname, lastname, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    @Override
    public double getFullSalary() {
        //return super.getFullSalary() + super.getFullSalary() / 100.0 * percentCommission;
        return super.getFullSalary() * (1 + percentCommission / 100.0);
    }
}
