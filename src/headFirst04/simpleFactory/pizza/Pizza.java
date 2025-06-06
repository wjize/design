package headFirst04.simpleFactory.pizza;


import java.util.ArrayList;

/**
 * Created by wangjize on 2025/6/6.
 */
public abstract class Pizza {
    String name;
    ArrayList<String> topping;

    public Pizza() {
        topping = new ArrayList<>();
    }

    public void prepare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Adding topping: ");
        for (String s : topping) {
            System.out.println("   " + s);
        }
    }

    public void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public void eat() {
        System.out.println("Eaten the pizza" + "\n");
    }
    public String getName() {
        return name;
    }
}
