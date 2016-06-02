package com.cdk.pass2;

/**
 * Created by mehras on 31/05/16.
 */
public abstract class Animal {
    private String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();
}
