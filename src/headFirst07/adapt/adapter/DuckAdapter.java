package headFirst07.adapt.adapter;


import headFirst07.adapt.duck.Duck;
import headFirst07.adapt.duck.Turkey;

import java.util.Random;

/**
 * Created by wangjize on 2025/6/13.
 */
public class DuckAdapter implements Turkey {
    Duck duck;
    Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        if (rand.nextInt(5)  == 0) {
            duck.fly();
        }
    }
}
