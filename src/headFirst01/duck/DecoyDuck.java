package headFirst01.duck;


import headFirst01.duck.behaviorImpl.FlyNoWay;
import headFirst01.duck.behaviorImpl.MuteQuack;

/**
 * Created by wangjize on 2025/6/13.
 */
public class DecoyDuck extends Duck{
    public DecoyDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }

    public void display() {
        System.out.println("DecoyDuck.display()");
        System.out.println("I'm a duck Decoy");
    }
}
