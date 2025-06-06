package headFirst03.beverage;


/**
 * Created by wangjize on 2025/6/5.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso Coffee";
    }
    @Override
    public double cost() {
        return 1.99;
    }
}
