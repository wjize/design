package headFirst01.duck.behaviorImpl;


import headFirst01.duck.behavior.FlyBehavior;

/**
 * Created by wangjize on 2025/6/4.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
