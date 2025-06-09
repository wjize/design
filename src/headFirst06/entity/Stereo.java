package headFirst06.entity;


/**
 * Created by wangjize on 2025/6/9.
 */
public class Stereo {
    private String name;
    public Stereo() {
        this.name = "<UNK>";
    }
    public Stereo(String name) {
        this.name = name;
    }

    public void on(){
        System.out.println(this.name + " Stereo on");
    }
    public void off(){
        System.out.println(this.name + " Stereo off");
    }
    public void setCD() {
        System.out.println(this.name + " Stereo setCD");
    }
    public void setVolume(int volume) {
        System.out.println(this.name + " Stereo setVolume with volume = " + volume);
    }

}
