package headFirst08.entity;


/**
 * Created by wangjize on 2025/6/10.
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling Water");
    }
    public void pourInCup() {
        System.out.println("Pouring into Cup");
    }
}
