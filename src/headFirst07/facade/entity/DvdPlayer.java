package headFirst07.facade.entity;


/**
 * Created by wangjize on 2025/6/10.
 */
public class DvdPlayer {
    Amplifier amplifier;

    public void on() {
        System.out.println("Top-O-line DVD Player on");
    }
    public void off() {
        System.out.println("Top-O-line DVD Player off");
    }
    public void play(String movie) {
        System.out.println("Top-O-line DVD Player playing " + movie);
    }
    public void stop(String movie) {
        System.out.println("Top-O-line DVD Player stopping " + movie);
    }
    public void eject() {
        System.out.println("Top-O-line DVD Player eject");
    }

}
