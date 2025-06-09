package headFirst06.entity;


/**
 * Created by wangjize on 2025/6/9.
 */
public class Light {
    private String name;
    public Light() {
        this.name = "<UNK>";
    }
    public Light(String name) {
        this.name = name;
    }
    public void on() {
        System.out.println(this.name + " switch on");
    }
    public void off() {
        System.out.println(this.name + " switch off");
    }
}
