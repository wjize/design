package headFirst06.commadImpl;


import headFirst06.command.Command;
import headFirst06.entity.GarageDoor;

/**
 * Created by wangjize on 2025/6/9.
 */
public class GarageDoorDownCommand implements Command {
    GarageDoor gd;
    public GarageDoorDownCommand(GarageDoor gd) {
        this.gd = gd;
    }
    @Override
    public void execute() {
        gd.down();
    }

    @Override
    public void undo() {
        gd.up();
    }
}
