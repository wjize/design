package headFirst06.simple.commandImpl;


import headFirst06.simple.command.Command;
import headFirst06.simple.entity.Light;

/**
 * Created by wangjize on 2025/6/13.
 */
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }
}