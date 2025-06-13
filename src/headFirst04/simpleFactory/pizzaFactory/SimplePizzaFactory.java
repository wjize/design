package headFirst04.simpleFactory.pizzaFactory;


import headFirst04.simpleFactory.pizza.*;

/**
 * Created by wangjize on 2025/6/6.
 */

// 这里其实可以不抽象, 只是为了和后面的工厂作对比
public abstract class SimplePizzaFactory {
    /* 不抽象使用如下代码
    Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }
        return pizza;
     */
    public abstract Pizza createPizza(String type);
}
