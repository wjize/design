package headFirst04.simpleFactory;


import headFirst04.simpleFactory.pizza.Pizza;
import headFirst04.simpleFactory.pizzaFactory.CaliforniaPizzaFactory;
import headFirst04.simpleFactory.pizzaFactory.ChicagoPizzaFactory;
import headFirst04.simpleFactory.pizzaFactory.SimplePizzaFactory;
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
        SimplePizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);
        Pizza nyPizza = nyStore.orderPizza("veggie");
        System.out.println("We ordered a " + nyPizza.getName() + "\n");


        SimplePizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);
        Pizza chicagoPizza = chicagoStore.orderPizza("clam");
        System.out.println("We ordered a " + chicagoPizza.getName() + "\n");

        SimplePizzaFactory californiaFactory = new CaliforniaPizzaFactory();
        PizzaStore californiaStore = new PizzaStore(californiaFactory);
        Pizza californiaPizza = californiaStore.orderPizza("pepperoni");
        System.out.println("We ordered a " + californiaPizza.getName() + "\n");
    }
}
