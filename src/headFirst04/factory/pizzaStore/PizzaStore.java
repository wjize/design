package headFirst04.factory.pizzaStore;


import headFirst04.factory.pizza.Pizza;

/**
 * Created by wangjize on 2025/6/6.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
        return pizza;
    }

    public abstract Pizza createPizza(String type);

}
