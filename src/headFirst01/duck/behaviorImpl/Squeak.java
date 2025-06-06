package headFirst01.duck.behaviorImpl;


import headFirst01.duck.behavior.QuackBehavior;

/**
 * Created by wangjize on 2025/6/4.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("zi_zi_zi");
    }
}
