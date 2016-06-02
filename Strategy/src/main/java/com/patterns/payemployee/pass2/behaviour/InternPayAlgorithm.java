package com.patterns.payemployee.pass2.behaviour;

/**
 * Created by mehras on 01/06/16.
 */
public class InternPayAlgorithm implements PayAlgorithm {
    @Override
    public double getPay(double basicSalary) {
        return basicSalary + (basicSalary * 0.10);
    }
}
