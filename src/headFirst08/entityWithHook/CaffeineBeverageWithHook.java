package headFirst08.entityWithHook;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by wangjize on 2025/6/10.
 */
public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling Water");
    }
    public void pourInCup() {
        System.out.println("Pouring into Cup");
    }
    public boolean customerWantCondiments() {
        return false;
    }


}
