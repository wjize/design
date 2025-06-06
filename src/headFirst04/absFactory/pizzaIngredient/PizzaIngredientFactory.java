package headFirst04.absFactory.pizzaIngredient;


import headFirst04.absFactory.material.*;

/**
 * Created by wangjize on 2025/6/6.
 */
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Pepperoni createPepperoni();
    Clams createClams();
    Veggies[] createVeggies();
}
