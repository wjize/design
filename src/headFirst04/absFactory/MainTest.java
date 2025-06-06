package headFirst04.absFactory;


import headFirst04.absFactory.pizzaStore.NYPizzaStroe;
import headFirst04.absFactory.pizzaStore.PizzaStore;

/**
 * Created by wangjize on 2025/6/6.
 */
public class MainTest {
    public static void absFactoryPatten() {
        PizzaStore nypizzaStore = new NYPizzaStroe();
        nypizzaStore.orderPizza("cheese").eat();
    }
}
