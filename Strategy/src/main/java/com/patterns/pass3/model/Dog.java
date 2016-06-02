package com.patterns.pass3.model;

import com.patterns.pass3.behaviour.Flyable;

/**
 * Created by mehras on 31/05/16.
 */
public class Dog extends Animal {
    public Dog(String name, Flyable flyingBehaviour) {
        super(name);
        this.setFlyingBehaviour(flyingBehaviour);
    }

    @Override
    public void makeSound() {
        System.out.println("I make a bow-wow sound!");
    }
}
