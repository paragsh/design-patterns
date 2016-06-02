package com.patterns.payemployee.pass2;

import com.patterns.payemployee.pass1.EmployeeType;
import com.patterns.payemployee.pass2.behaviour.InternPayAlgorithm;
import com.patterns.payemployee.pass2.behaviour.WebDeveloperPayAlgorithm;
import com.patterns.payemployee.pass2.model.Employee;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by mehras on 01/06/16.
 */
public class PluggablePayAlgorithmTest {

    @Test
    public void testPlugging2PayAlgorithms() throws Exception {
        Employee shruti = new Employee("Shruti", EmployeeType.INTERN, 5000.0);
        shruti.setPayAlgorithm(new InternPayAlgorithm());

        Assert.assertEquals(5500.0, shruti.getPay(), 0.0);

        shruti.setPayAlgorithm(new WebDeveloperPayAlgorithm());
        Assert.assertEquals(6000.0, shruti.getPay(), 0.0);

    }
}
