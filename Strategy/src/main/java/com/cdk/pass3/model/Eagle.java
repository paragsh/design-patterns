package com.cdk.pass3.model;

import com.cdk.pass3.behaviour.Flyable;

/**
 * Created by mehras on 31/05/16.
 */
public class Eagle extends Animal {
    public Eagle(String name, Flyable flyingBehaviour) {
        super(name);
        this.setFlyingBehaviour(flyingBehaviour);
    }

    @Override
    public void makeSound() {
        System.out.println("I am an Eagle, I squeak!");
    }
}
