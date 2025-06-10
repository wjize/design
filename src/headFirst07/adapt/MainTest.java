package headFirst07.adapt;


import headFirst07.adapt.duck.Duck;
import headFirst07.adapt.duckImpl.MallardDuck;
import headFirst07.adapt.duckImpl.WildTurkey;

/**
 * Created by wangjize on 2025/6/10.
 */

/*
 * 适配器模式
 * 将一个类的接口，转换成客户期望的另一个接口。适配器让原本接口不兼容的类可以合作无间。
 */
public class MainTest {
    public static void adaptPattern() {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }
    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
