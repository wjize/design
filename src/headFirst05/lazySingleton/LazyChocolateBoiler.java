package headFirst05.lazySingleton;


/**
 * Created by wangjize on 2025/6/6.
 */
public class LazyChocolateBoiler {
    private static LazyChocolateBoiler chocolateBoiler = new LazyChocolateBoiler("lazy singleton");
    private String name;
    private boolean empty;
    private boolean boiled;

    private LazyChocolateBoiler(String name) {
        empty = true;
        boiled = false;
        this.name = name;
    }
    public static LazyChocolateBoiler getInstance() {
        return chocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println(this.toString().split("@")[1]
                    + ": " + this.name
                    + " Fill the boiler with the chocolate and milk mixture");
        }
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            System.out.println(this.toString().split("@")[1]
                    + ": " + this.name
                    + " Drain the chocolate and milk mixture");
            empty = true;
        }
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            System.out.println(this.toString().split("@")[1]
                    + ": " + this.name
                    + " Boil the chocolate and milk mixture");
            boiled = true;
        }
    }

    public void says() {
        System.out.println(this.toString().split("@")[1]
                + ": " + this.name
                + " Says the chocolate and milk mixture");
    }

    public boolean isEmpty() {
        return empty;
    }
    public boolean isBoiled() {
        return boiled;
    }
}
