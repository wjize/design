package headFirst01.duck.behaviorImpl;


import headFirst01.duck.behavior.QuackBehavior;

/**
 * Created by wangjize on 2025/6/4.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("gua_gua_gua");
    }
}
