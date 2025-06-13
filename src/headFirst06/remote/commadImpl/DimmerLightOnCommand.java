package headFirst06.remote.commadImpl;


import headFirst06.remote.command.Command;
import headFirst06.remote.entity.Light;

/**
 * Created by wangjize on 2025/6/13.
 */
public class DimmerLightOnCommand implements Command {
    Light light;
    int prevLevel;

    public DimmerLightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        prevLevel = light.getLevel();
        light.dim(75);
    }

    public void undo() {
        light.dim(prevLevel);
    }
}