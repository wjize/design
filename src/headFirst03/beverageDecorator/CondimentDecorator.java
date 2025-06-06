package headFirst03.beverageDecorator;


import headFirst03.beverage.Beverage;

/**
 * Created by wangjize on 2025/6/5.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
