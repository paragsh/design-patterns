package eca.patterns.adapter;

/**
 * Collaborates with objects conforming to the Target interface.
 */
public class Client {

    private final Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void showAdaptedMessage() {
        target.request();
    }

}
