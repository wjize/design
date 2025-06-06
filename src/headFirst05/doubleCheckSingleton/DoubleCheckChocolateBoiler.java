package headFirst05.doubleCheckSingleton;


import headFirst05.eagerSingleton.EagerChocolateBoiler;

/**
 * Created by wangjize on 2025/6/6.
 */
public class DoubleCheckChocolateBoiler {
    // JAVA1.4之前，双重检查线程不安全，1.5之后新增volatile关键字解决该问题
    private static volatile DoubleCheckChocolateBoiler chocolateBoiler;
    private String name;
    private boolean empty;
    private boolean boiled;

    private DoubleCheckChocolateBoiler(String name) {
        empty = true;
        boiled = false;
        this.name = name;
    }
    public static DoubleCheckChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            synchronized (DoubleCheckChocolateBoiler.class) {
                if (chocolateBoiler == null) {
                    chocolateBoiler = new DoubleCheckChocolateBoiler("double-check singleton");
                }
            }
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
