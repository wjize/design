package headFirst01.duck;


import headFirst01.duck.behaviorImpl.FlyWithWings;
import headFirst01.duck.behaviorImpl.Quack;

/**
 * Created by wangjize on 2025/6/4.
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        this.name = "Mallard Duck: ";
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println(this.name + "Im Mallard Duck");
    }
}
