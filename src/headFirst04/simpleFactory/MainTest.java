package headFirst04.simpleFactory;


import headFirst04.simpleFactory.pizzaFactory.CaliforniaPizzaFactory;
import headFirst04.simpleFactory.pizzaFactory.ChicagoPizzaFactory;
import headFirst04.simpleFactory.pizzaStore.PizzaStore;
import headFirst04.simpleFactory.pizzaFactory.NYPizzaFactory;

/**
 * Created by wangjize on 2025/6/5.
 */

/*
 * 简单工厂方法模式
 */
public class MainTest {
    public static void simpleFactoryPattern() {
        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        nyStore.orderPizza("veggie").eat();

        ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
        chicagoStore.orderPizza("clam").eat();

        CaliforniaPizzaFactory californiaFactory = new CaliforniaPizzaFactory();
        PizzaStore californiaStore = new PizzaStore(californiaFactory);
        californiaStore.orderPizza("pepperoni").eat();
    }
}
