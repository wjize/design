package headFirst01;


import headFirst01.duck.*;
import headFirst01.duck.behaviorImpl.FlyRocketPowered;

/**
 * Created by wangjize on 2025/6/4.
 */

/*
 * 策略模式
 * 定义了算法族，分别封装起来，让它们之间可以相互转换，此模式让算法的变化独立于使用算法的客户。
 */

public class MainTest {
    public static void strategyPattern() {
        Duck mallard1 = new MallardDuck();
        System.out.println("Going to call MallardDuck.performQuack()");
        mallard1.performQuack();
        System.out.println("Going to call MallardDuck.performFly()");
        mallard1.performFly();

        Duck model1 = new ModelDuck();
        System.out.println("Going to call ModelDuck.performFly()");
        model1.performFly();
        model1.setFlyBehavior(new FlyRocketPowered());
        System.out.println("Going to call ModelDuck.performFly() after setting behavior at runtime()");
        model1.performFly();

        System.out.println("\n---------\n");

        MallardDuck    mallard = new MallardDuck();
        RubberDuck rubberDuckie = new RubberDuck();
        DecoyDuck decoy = new DecoyDuck();
        ModelDuck    model = new ModelDuck();

        System.out.println("\nGoing to call MallardDuck.performQuack()");
        mallard.performQuack();

        System.out.println("\nGoing to call RubberDuck.performQuack()");
        rubberDuckie.performQuack();

        System.out.println("\nGoing to call DecoyDuck.performQuack()");
        decoy.performQuack();

        System.out.println("\nGoing to call ModelDuck.performFly()");
        model.performFly();

        model.setFlyBehavior(new FlyRocketPowered());
        System.out.println("\nGoing to call ModelDuck.performFly() after setting setFlyBehavior()");
        model.performFly();


    }
}
