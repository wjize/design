package headFirst06.remote.commadImpl;


import headFirst06.remote.command.Command;
import headFirst06.remote.entity.Light;

/**
 * Created by wangjize on 2025/6/13.
 */
public class DimmerLightOffCommand implements Command {
    Light light;
    int prevLevel;

    public DimmerLightOffCommand(Light light) {
        this.light = light;
        prevLevel = 100;
    }

    public void execute() {
        prevLevel = light.getLevel();
        light.off();
    }

    public void undo() {
        light.dim(prevLevel);
    }
}