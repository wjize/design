package headFirst08;


import headFirst08.entity.Coffee;
import headFirst08.entity.Tea;
import headFirst08.entityWithHook.CoffeeWithHook;
import headFirst08.entityWithHook.TeaWithHook;

/**
 * Created by wangjize on 2025/6/10.
 */

/*
 * 模版方法模式
 * 在一个方法中定义一个算法的骨架，而将一些算法步骤延迟到子类中。
 * 模版方法使得子类可以在不改变算法结构的情况下，重新定义算法中的某些步骤。
 */
public class MainTest {
    public static void templatePattern() {
        Tea tea = new Tea();
        tea.prepareRecipe();
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();

        System.out.println("\n----------\n");
        TeaWithHook teaWithHook = new TeaWithHook();
        CoffeeWithHook coffeeWithHook = new CoffeeWithHook();

        System.out.println("Making tea...");
        teaWithHook.prepareRecipe();

        System.out.println("\nMaking coffee...");
        coffeeWithHook.prepareRecipe();
    }
}
