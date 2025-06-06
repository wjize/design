package headFirst03;


import headFirst03.beverage.Beverage;
import headFirst03.beverage.Espresso;
import headFirst03.beverage.HouseBlend;
import headFirst03.beverageDecorator.Mocha;

/**
 * Created by wangjize on 2025/6/5.
 */
public class MainTest {
    public static void decorativePattern() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage1 = new HouseBlend();
        beverage1 = new Mocha(beverage1);
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
