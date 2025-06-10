package headFirst07.facade.entity;


/**
 * Created by wangjize on 2025/6/10.
 */
public class Projector {
    DvdPlayer dvdPlayer;

    public void on() {
        System.out.println("Top-O-line Projector on");
    }
    public void off() {
        System.out.println("Top-O-line Projector off");
    }
    public void tvMode() {
        System.out.println("Top-O-line Projector tvMode");
    }
    public void wideScreenMode() {
        System.out.println("Top-O-line Projector in wideScreenMode mode (16x9)");
    }

}
