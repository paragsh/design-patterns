package com.patterns.payemployee.pass2.comparators;

import com.patterns.payemployee.pass2.model.Employee;

import java.util.Comparator;

/**
 * Created by mehras on 01/06/16.
 */
public class EmployeeBasicSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        final double emp1BasicSalary = emp1.getBasicSalary();
        final double emp2BasicSalary = emp2.getBasicSalary();
        if (emp1BasicSalary > emp2BasicSalary) {
            return 1;
        } else if (emp1BasicSalary < emp2BasicSalary) {
            return -1;
        } else {
            return 0;
        }
    }
}
