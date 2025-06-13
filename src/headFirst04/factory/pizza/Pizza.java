package headFirst04.factory.pizza;


import java.util.ArrayList;

/**
 * Created by wangjize on 2025/6/6.
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings;

    public Pizza() {
        toppings = new ArrayList<>();
    }

    public void prepare() {
        System.out.println("Preparing " + this.name);
        System.out.println("Tossing dough..." + this.dough);
        System.out.println("Adding sauce..." + this.sauce);
        System.out.println("Adding topping: ");
        for (String s : toppings) {
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


    public String getName() {
        return name;
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + name + " ----\n");
        display.append(dough + "\n");
        display.append(sauce + "\n");
        for (int i = 0; i < toppings.size(); i++) {
            display.append((String )toppings.get(i) + "\n");
        }
        return display.toString();
    }
}
