package headFirst04.factory.pizza;


/**
 * Created by wangjize on 2025/6/6.
 */
public class ChicagoClamPizza extends Pizza {
    public ChicagoClamPizza() {
        name = "Chicago Clam Pizza";
        dough = "Thin Crust Dough";
        sauce = "Sauce a lot";
        topping.add("Shredded Mozzarella Clam Pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into Chicago slices");
    }
}
