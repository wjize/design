package headFirst04.factory.pizzaStore;


import headFirst04.factory.pizza.*;

/**
 * Created by wangjize on 2025/6/6.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new ChicagoCheesePizza();
                break;
            case "clam":
                pizza = new ChicagoClamPizza();
                break;
        }
        return pizza;
    }
}
