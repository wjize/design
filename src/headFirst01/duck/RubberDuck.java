package headFirst01.duck;


import headFirst01.duck.behaviorImpl.FlyNoWay;
import headFirst01.duck.behaviorImpl.MuteQuack;

/**
 * Created by wangjize on 2025/6/4.
 */
public class RubberDuck extends Duck {
    public RubberDuck() {
        this.name = "Rubber Duck: ";
        this.quackBehavior = new MuteQuack();
        this.flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println(this.name + "I am Rubber Duck");
    }
}
