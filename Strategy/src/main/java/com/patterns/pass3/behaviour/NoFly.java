package com.patterns.pass3.behaviour;

/**
 * Created by mehras on 31/05/16.
 */
public class NoFly implements Flyable {
    public void fly() {
        System.out.println("Sorry! I cannot fly.");
    }
}
