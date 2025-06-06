package headFirst04.absFactory.pizza;


import headFirst04.absFactory.material.*;

/**
 * Created by wangjize on 2025/6/6.
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Pepperoni pepperoni;
    Cheese cheese;
    Clams clams;
    Veggies veggies;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }
    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    public void box() {
        System.out.println("Place the pizza in official box");
    }
    public void eat() {
        System.out.println("Eat the pizza");
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return name;
    }
}
