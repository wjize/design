package headFirst06.simple.commandImpl;


import headFirst06.simple.command.Command;
import headFirst06.simple.entity.GarageDoor;

/**
 * Created by wangjize on 2025/6/13.
 */
public class GarageDoorOpenCommand implements Command {
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }
}
