package headFirst08.entityWithHook;


/**
 * Created by wangjize on 2025/6/10.
 */
public class TeaWithHook extends CaffeineBeverageWithHook {

    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }

}
