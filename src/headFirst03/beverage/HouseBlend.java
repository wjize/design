package headFirst03.beverage;


/**
 * Created by wangjize on 2025/6/5.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}
