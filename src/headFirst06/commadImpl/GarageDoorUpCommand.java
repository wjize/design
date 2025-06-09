package headFirst06.commadImpl;


import headFirst06.command.Command;
import headFirst06.entity.GarageDoor;

/**
 * Created by wangjize on 2025/6/9.
 */
public class GarageDoorUpCommand implements Command {
    GarageDoor gd;
    public GarageDoorUpCommand(GarageDoor gd) {
        this.gd = gd;
    }
    @Override
    public void execute() {
        gd.up();
    }

    @Override
    public void undo() {
        gd.down();
    }
}
