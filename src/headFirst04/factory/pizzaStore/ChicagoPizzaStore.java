package headFirst04.factory.pizzaStore;


import headFirst04.factory.pizza.*;

/**
 * Created by wangjize on 2025/6/6.
 */
public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
