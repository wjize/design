package headFirst01.duck;


import headFirst01.duck.behaviorImpl.FlyNoWay;
import headFirst01.duck.behaviorImpl.Quack;

/**
 * Created by wangjize on 2025/6/4.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
