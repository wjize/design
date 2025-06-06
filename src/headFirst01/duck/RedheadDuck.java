package headFirst01.duck;


import headFirst01.duck.behaviorImpl.FlyWithWings;
import headFirst01.duck.behaviorImpl.Squeak;

/**
 * Created by wangjize on 2025/6/4.
 */
public class RedheadDuck extends Duck {
    public RedheadDuck() {
        this.name = "Redhead Duck: ";
        this.quackBehavior = new Squeak();
        this.flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println(this.name + "I am redhead duck");
    }
}
