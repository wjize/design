package headFirst07.facade.entity;


/**
 * Created by wangjize on 2025/6/10.
 */
public class TheaterLights {
    public void on() {
        System.out.println("Theater Ceiling lights on");
    }
    public void off() {
        System.out.println("Theater Ceiling lights off");
    }
    public void dim(int number) {
        System.out.println("Theater Ceiling lights dim to " + number + "%");
    }
}
