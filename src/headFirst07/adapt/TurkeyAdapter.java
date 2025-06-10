package headFirst07.adapt;


import headFirst07.adapt.duck.Duck;
import headFirst07.adapt.duck.Turkey;

/**
 * Created by wangjize on 2025/6/10.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
