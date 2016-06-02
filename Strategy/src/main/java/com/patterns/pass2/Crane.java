package com.patterns.pass2;

/**
 * Created by mehras on 31/05/16.
 */
public class Crane extends Animal implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("I am a Crane and I make loud disturbing sounds!");
    }

    public void fly() {
        System.out.println("Oh! I so love to fly.");
    }
}
