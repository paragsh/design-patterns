package com.cdk.payemployee.pass2.model;

import com.cdk.payemployee.pass1.EmployeeType;
import com.cdk.payemployee.pass2.behaviour.PayAlgorithm;

/**
 * Created by mehras on 01/06/16.
 */
public class Employee {
    private String name;
    private EmployeeType employeeType;
    private double basicSalary;
    private PayAlgorithm payAlgorithm;

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

    public void setPayAlgorithm(PayAlgorithm payAlgorithm) {
        this.payAlgorithm = payAlgorithm;
    }

    public double getPay() {
        return payAlgorithm.getPay(this.basicSalary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "basicSalary=" + basicSalary +
                ", name='" + name + '\'' +
                ", employeeType=" + employeeType +
                '}';
    }
}
