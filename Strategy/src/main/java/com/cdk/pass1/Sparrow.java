package com.cdk.pass1;

/**
 * Created by mehras on 31/05/16.
 */
public class Sparrow extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Being a bird - I simply chirp!");
    }

    @Override
    public void fly() {
        System.out.println("Oh! I so love to fly.");
    }
}
