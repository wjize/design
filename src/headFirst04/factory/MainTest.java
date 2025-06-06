package headFirst04.factory;


import headFirst04.factory.pizza.Pizza;
import headFirst04.factory.pizzaStore.ChicagoPizzaStore;
import headFirst04.factory.pizzaStore.NYPizzaStore;
import headFirst04.factory.pizzaStore.PizzaStore;

/**
 * Created by wangjize on 2025/6/5.
 */

/*
 * 工厂方法模式
 * 定义了一个创建对象的接口，但由子类决定要实例化的类是哪一个，工厂方法让类把实例化推迟到子类
 */
public class MainTest {
    public static void factoryPattern() {
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        Pizza nyPizza1 = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + nyPizza1.getName() + "\n");
        Pizza nyPizza2 = nyPizzaStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + nyPizza2.getName() + "\n");

        Pizza ChicagoPizza1 = chicagoPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + ChicagoPizza1.getName() + "\n");
        Pizza ChicagoPizza2 = chicagoPizzaStore.orderPizza("clam");
        System.out.println("Joel ordered a " + ChicagoPizza2.getName() + "\n");
    }
}
