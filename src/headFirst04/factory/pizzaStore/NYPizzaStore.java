package headFirst04.factory.pizzaStore;


import headFirst04.factory.pizza.*;

/**
 * Created by wangjize on 2025/6/6.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "cheese":
                pizza = new NYCheesePizza();
                break;
            case "clam":
                pizza = new NYClamPizza();
                break;
        }

        return pizza;
    }
}
