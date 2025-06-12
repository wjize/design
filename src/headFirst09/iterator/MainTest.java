package headFirst09.iterator;


import headFirst09.iterator.menuMagager.DinerMenu;
import headFirst09.iterator.menuMagager.PancakeHouseMenu;
import headFirst09.iterator.waiter.Waitress;

/**
 * Created by wangjize on 2025/6/10.
 */
public class MainTest {
    public static void iteratorPattern() {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        waitress.printMenu();
    }
}
