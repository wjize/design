package headFirst01.duck;


import headFirst01.duck.behavior.FlyBehavior;
import headFirst01.duck.behavior.QuackBehavior;

/**
 * Created by wangjize on 2025/6/4.
 */
public abstract class Duck {
    String name;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
        this.name = "<UNK>";
    }

    public void swim() {
        System.out.println("All duck can swim");
    }
    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
    public void performQuack() {
        this.quackBehavior.quack();
    }
    public void performFly() {
        this.flyBehavior.fly();
    }

    public abstract void display();
}
