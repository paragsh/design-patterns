package com.cdk.pass3.model;

import com.cdk.pass3.behaviour.Flyable;

/**
 * Created by mehras on 31/05/16.
 */
public abstract class Animal {
    private String name;
    private Flyable flyingBehaviour;

    public Animal(String name) {
        this.name = name;
    }

    public void setFlyingBehaviour(Flyable flyingBehaviour) {
        this.flyingBehaviour = flyingBehaviour;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public void makeFly() {
        flyingBehaviour.fly();
    }
}
