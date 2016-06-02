package com.cdk.payemployee.pass2.comparators;

import com.cdk.payemployee.pass2.model.Employee;

import java.util.Comparator;

/**
 * Created by mehras on 01/06/16.
 */
public class EmployeeNameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getName().compareTo(emp2.getName());
    }
}
