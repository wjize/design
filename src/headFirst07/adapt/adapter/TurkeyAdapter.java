package headFirst07.adapt.adapter;


import headFirst07.adapt.duck.Duck;
import headFirst07.adapt.duck.Turkey;

/**
 * Created by wangjize on 2025/6/13.
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for(int i=0; i < 5; i++) {
            turkey.fly();
        }
    }
}
