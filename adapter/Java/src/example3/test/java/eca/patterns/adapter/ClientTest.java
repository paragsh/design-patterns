package eca.patterns.adapter;

import org.testng.annotations.Test;

public class ClientTest {

    private Target target = new Adapter();
    private Client client = new Client(target);

    @Test
    public void showAdaptedMessage() throws Exception {
        client.showAdaptedMessage();
    }
}