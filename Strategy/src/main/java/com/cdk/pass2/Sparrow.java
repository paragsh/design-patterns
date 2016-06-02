package com.cdk.pass2;

/**
 * Created by mehras on 31/05/16.
 */
public class Sparrow extends Animal implements Flyable {
    @Override
    public void makeSound() {
        System.out.println("Being a bird - I simply chirp!");
    }

    public void fly() {
        System.out.println("I am a bird and oh! I so love to fly.");
    }
}
