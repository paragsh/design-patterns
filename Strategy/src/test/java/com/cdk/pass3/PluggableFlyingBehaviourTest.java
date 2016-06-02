package com.cdk.pass3;

import com.cdk.pass3.behaviour.NoFly;
import com.cdk.pass3.behaviour.SimpleFly;
import com.cdk.pass3.model.Animal;
import com.cdk.pass3.model.Dog;
import org.junit.Test;

/**
 * Created by mehras on 31/05/16.
 */
public class PluggableFlyingBehaviourTest {

    @Test
    public void testPlugging2FlyingBehavioursInAnimal() throws Exception {
        Animal dog = new Dog("Bruno", new NoFly());
        dog.makeFly();

        dog.setFlyingBehaviour(new SimpleFly());
        dog.makeFly();

    }
}
