package headFirst04.absFactory.pizzaIngredientImpl;


import headFirst04.absFactory.material.*;
import headFirst04.absFactory.pizzaIngredient.PizzaIngredientFactory;

/**
 * Created by wangjize on 2025/6/6.
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Clams createClams() {
        return new Clams();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[0];
    }
}
