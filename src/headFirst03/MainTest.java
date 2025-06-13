package headFirst03;


import headFirst03.beverage.Beverage;
import headFirst03.beverage.DarkRoast;
import headFirst03.beverage.Espresso;
import headFirst03.beverage.HouseBlend;
import headFirst03.beverageDecorator.Mocha;
import headFirst03.beverageDecorator.Soy;
import headFirst03.beverageDecorator.Whip;

/**
 * Created by wangjize on 2025/6/5.
 */
public class MainTest {
    public static void decorativePattern() {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription()
                + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3.getDescription()
                + " $" + beverage3.cost());
    }
}
