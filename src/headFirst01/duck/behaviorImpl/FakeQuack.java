package headFirst01.duck.behaviorImpl;


import headFirst01.duck.behavior.QuackBehavior;

/**
 * Created by wangjize on 2025/6/13.
 */
public class FakeQuack implements QuackBehavior {
    public void quack() {
        System.out.println("FlyNoWay.fly()");
        System.out.println("I can't fly");
    }
}
