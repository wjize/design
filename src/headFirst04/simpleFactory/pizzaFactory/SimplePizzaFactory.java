package headFirst04.simpleFactory.pizzaFactory;


import headFirst04.simpleFactory.pizza.*;

/**
 * Created by wangjize on 2025/6/6.
 */

// 这里其实可以不抽象, 只是为了和后面的工厂作对比
public abstract class SimplePizzaFactory {
    public abstract Pizza createPizza(String type);
}
