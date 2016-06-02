package com.cdk.payemployee.pass1;

/**
 * Created by mehras on 01/06/16.
 */
public class Employee {
    private String name;
    private EmployeeType employeeType;
    private double basicSalary;

    public Employee(String name, EmployeeType employeeType, double basicSalary) {
        this.name = name;
        this.employeeType = employeeType;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double getPay() {
        double pay = 0.0;

        if(employeeType.equals(EmployeeType.INTERN)) {
            pay = basicSalary + (basicSalary * 0.10);
        } else if (employeeType.equals(EmployeeType.WEB_DEVELOPER)) {
            pay = basicSalary + (basicSalary * 0.20);
        } else if (employeeType.equals(EmployeeType.TRAINEE)) {
            pay = basicSalary + (basicSalary * 0.12);
        } else if (employeeType.equals(EmployeeType.WEB_DESIGNER)) {
            pay = basicSalary + (basicSalary * 0.15);
        }
        return pay;
    }
}
