package headFirst05.eagerSingleton;



/**
 * Created by wangjize on 2025/6/6.
 */
public class EagerChocolateBoiler {
    private static EagerChocolateBoiler chocolateBoiler;
    private String name;
    private boolean empty;
    private boolean boiled;

    private EagerChocolateBoiler(String name) {
        empty = true;
        boiled = false;
        this.name = name;
    }
    public static synchronized EagerChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            chocolateBoiler = new EagerChocolateBoiler("eager singleton");
        }
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
