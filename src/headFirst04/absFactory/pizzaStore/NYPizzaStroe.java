package headFirst04.absFactory.pizzaStore;


import headFirst04.absFactory.pizza.CheesePizza;
import headFirst04.absFactory.pizza.Pizza;
import headFirst04.absFactory.pizzaIngredient.PizzaIngredientFactory;
import headFirst04.absFactory.pizzaIngredientImpl.NYPizzaIngredientFactory;

/**
 * Created by wangjize on 2025/6/6.
 */
public class NYPizzaStroe extends PizzaStore {
    @Override
    public Pizza createPizza(String items) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(items.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        }
        return pizza;
    }
}
