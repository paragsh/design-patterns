package com.patterns.pass1;

/**
 * Created by mehras on 31/05/16.
 */
public class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("I make a bow-wow sound!");
    }

    @Override
    public void fly() {
        System.out.println("I am a dog and I cannot fly!");
    }
}
