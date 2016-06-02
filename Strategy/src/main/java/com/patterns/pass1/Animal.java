package com.patterns.pass1;

/**
 * Created by mehras on 31/05/16.
 */
public abstract class Animal {
    private String name;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();
    public abstract void fly();

    public String getName() {
        return name;
    }
}
