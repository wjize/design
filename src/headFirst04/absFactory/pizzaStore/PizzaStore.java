package headFirst04.absFactory.pizzaStore;


import headFirst04.absFactory.pizza.Pizza;

/**
 * Created by wangjize on 2025/6/6.
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract Pizza createPizza(String items);

}
