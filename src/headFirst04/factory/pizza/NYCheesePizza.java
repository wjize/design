package headFirst04.factory.pizza;


/**
 * Created by wangjize on 2025/6/6.
 */
public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "NY Cheese Pizza";
        dough = "Dough";
        sauce = "Sauce";
        topping.add("Grated Reggiano cheese");
    }
}
