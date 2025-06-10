package headFirst07.adapt.duckImpl;


import headFirst07.adapt.duck.Turkey;

/**
 * Created by wangjize on 2025/6/10.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("wild turkey gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
