package headFirst04.factory.pizzaStore;


import headFirst04.factory.pizza.*;

/**
 * Created by wangjize on 2025/6/6.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}
