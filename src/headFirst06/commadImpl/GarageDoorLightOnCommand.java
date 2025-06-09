package headFirst06.commadImpl;


import headFirst06.command.Command;
import headFirst06.entity.GarageDoor;

/**
 * Created by wangjize on 2025/6/9.
 */
public class GarageDoorLightOnCommand implements Command {
    GarageDoor garageDoor;
    public GarageDoorLightOnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }
    @Override
    public void execute() {
        garageDoor.lightOn();
    }

    @Override
    public void undo() {
        garageDoor.lightOff();
    }
}
