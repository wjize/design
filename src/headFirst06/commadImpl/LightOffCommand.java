package headFirst06.commadImpl;


import headFirst06.command.Command;
import headFirst06.entity.Light;

/**
 * Created by wangjize on 2025/6/9.
 */
public class LightOffCommand implements Command {
    Light light;
    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
