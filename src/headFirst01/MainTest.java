package headFirst01;


import headFirst01.duck.behaviorImpl.FlyRocketPowered;
import headFirst01.duck.behaviorImpl.Squeak;
import headFirst01.duck.Duck;
import headFirst01.duck.MallardDuck;
import headFirst01.duck.ModelDuck;
import headFirst01.character.Character;
import headFirst01.character.King;
import headFirst01.character.weaponbehaviorImpl.SwordBehaivor;

/**
 * Created by wangjize on 2025/6/4.
 */

/*
 * 策略模式
 * 定义了算法族，分别封装起来，让它们之间可以相互转换，此模式让算法的变化独立于使用算法的客户。
 */

public class MainTest {
    public static void strategyPatten() {
        Duck mall = new MallardDuck();
        mall.performQuack();
        mall.performFly();
        mall.swim();
        mall.display();

        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.setQuackBehavior(new Squeak());
        model.performFly();
        model.performQuack();

        Character chr = new King();
        chr.setWeaponBehavior(new SwordBehaivor());
        chr.performWeapon();
        chr.fight();
    }
}
