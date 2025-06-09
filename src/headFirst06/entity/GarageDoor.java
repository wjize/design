package headFirst06.entity;


/**
 * Created by wangjize on 2025/6/9.
 */
public class GarageDoor {
    private String name;
    public GarageDoor() {
        this.name = "<UNK>";
    }
    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println(this.name + " Garage Door up");
    }
    public void down() {
        System.out.println(this.name + " Garage Door down");
    }
    public void lightOn() {
        System.out.println(this.name + " Garage Door Light On");
    }
    public void lightOff() {
        System.out.println(this.name + " Garage Door Light Off");
    }
}
