package com.patterns.java.internals;

import com.patterns.payemployee.pass1.EmployeeType;
import com.patterns.payemployee.pass2.comparators.EmployeeBasicSalaryComparator;
import com.patterns.payemployee.pass2.comparators.EmployeeNameComparator;
import com.patterns.payemployee.pass2.model.Employee;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by mehras on 01/06/16.
 */
public class PluggableComparatorTest {

    @Test
    public void testPluggableEmployeeComparators() throws Exception {
        List<Employee> employees = getSampleEmployees(3);

        Collections.sort(employees, new EmployeeNameComparator());
        System.out.println(employees);

        Collections.sort(employees, new EmployeeBasicSalaryComparator());
        System.out.println(employees);
    }

    private List<Employee> getSampleEmployees(int numberOfEmployees) {
        List<Employee> employees = new ArrayList<>(numberOfEmployees);

        for (int i = numberOfEmployees; i > 0; i--) {
            employees.add(new Employee("A"+i, EmployeeType.INTERN, Math.random()*5000));
        }

        return employees;
    }
}
