package headFirst07.facade.entity;


/**
 * Created by wangjize on 2025/6/10.
 */
public class Amplifier {
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;

    public void on() {
        System.out.println("Top-O-line Amplifier on");
    }
    public void off() {
        System.out.println("Top-O-line Amplifier off");
    }
    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }
    public void setDvdPlayer(DvdPlayer dvdPlayer) {
        this.dvdPlayer = dvdPlayer;
        System.out.println("Top-O-line Amplifier setting DVD Player to Top-O-line DVD Player");
    }
    public void setVolume(int volume) {
        System.out.println("Top-O-line Amplifier setting volume to " + volume);
    }
    public void pause() {

    }
    public void play() {

    }
    public void stop() {

    }
}
