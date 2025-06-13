package headFirst01.duck.behaviorImpl;


import headFirst01.duck.behavior.FlyBehavior;

/**
 * Created by wangjize on 2025/6/4.
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("FlyRocketPowered.fly()");
        System.out.println("I'm flying with a rocket");
    }
}
