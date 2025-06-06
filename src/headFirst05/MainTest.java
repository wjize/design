package headFirst05;


import headFirst05.doubleCheckSingleton.DoubleCheckChocolateBoiler;
import headFirst05.eagerSingleton.EagerChocolateBoiler;
import headFirst05.lazySingleton.LazyChocolateBoiler;

/**
 * Created by wangjize on 2025/6/6.
 */

/*
 * 单件模式
 * 确保一个类只有一个实例，并提供一个全局访问点。
 */
public class MainTest {
    public static void singletonPattern() {
        LazyChocolateBoiler lcb = LazyChocolateBoiler.getInstance();
        lcb.says();
        lcb.fill();

        EagerChocolateBoiler ecb = EagerChocolateBoiler.getInstance();
        ecb.says();
        ecb.fill();

        // JAVA1.4之前，双重检查线程不安全，1.5之后新增volatile关键字解决该问题
        DoubleCheckChocolateBoiler dcb = DoubleCheckChocolateBoiler.getInstance();
        dcb.says();
        dcb.fill();
    }
}
