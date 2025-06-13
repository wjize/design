package headFirst06.remote.commadImpl;


import headFirst06.remote.command.Command;
import headFirst06.remote.entity.Light;

/**
 * Created by wangjize on 2025/6/9.
 */
public class LightOnCommand implements Command {
    Light light;
    int level;
    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        level = light.getLevel();
        light.on();
    }

    public void undo() {
        light.dim(level);
    }
}
