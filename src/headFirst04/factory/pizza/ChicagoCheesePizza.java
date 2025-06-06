package headFirst04.factory.pizza;


/**
 * Created by wangjize on 2025/6/6.
 */
public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza() {
        name = "Chicago Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        topping.add("Shredded Mozzarella");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into Chicago slices");
    }

}
