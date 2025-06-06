package headFirst04.simpleFactory.pizzaFactory;


import headFirst04.simpleFactory.pizza.*;

/**
 * Created by wangjize on 2025/6/6.
 */
public class NYPizzaFactory extends SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        switch (type) {
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }
        return pizza;
    }
}
