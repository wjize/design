package headFirst04.simpleFactory.pizza;


import headFirst04.simpleFactory.pizza.Pizza;

/**
 * Created by wangjize on 2025/6/6.
 */
public class VeggiePizza extends Pizza {
    public VeggiePizza() {
        name = "Veggie Pizza";
        topping.add("Generally...");
    }
}
