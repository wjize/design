package headFirst03.beverage;


/**
 * Created by wangjize on 2025/6/5.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
