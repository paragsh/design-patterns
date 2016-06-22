package eca.patterns.adapter;

/**
 * Adapts the interface Adaptee to the Target interface.
 */
public class Adapter implements Target {

    public void request() {
        System.out.print("Adapted call");
        Adaptee adaptee = new Adaptee();
        adaptee.specificRequest();
    }

}
