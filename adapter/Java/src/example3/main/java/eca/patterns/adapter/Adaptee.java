package eca.patterns.adapter;

/**
 * Defines an existing interface that needs adapting.
 */
public class Adaptee {

    public void specificRequest() {
        System.out.print(" original call");
    }

}
