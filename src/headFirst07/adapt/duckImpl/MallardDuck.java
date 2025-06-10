package headFirst07.adapt.duckImpl;


import headFirst07.adapt.duck.Duck;

/**
 * Created by wangjize on 2025/6/10.
 */
public class MallardDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("mallard duck quack");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying");
    }
}
