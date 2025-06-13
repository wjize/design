package headFirst04.simpleFactory.pizzaStore;


import headFirst04.simpleFactory.pizza.Pizza;
import headFirst04.simpleFactory.pizzaFactory.SimplePizzaFactory;

/**
 * Created by wangjize on 2025/6/6.
 */
public class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
