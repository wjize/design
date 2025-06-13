package headFirst03.beverageDecorator;


import headFirst03.beverage.Beverage;

/**
 * Created by wangjize on 2025/6/13.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
