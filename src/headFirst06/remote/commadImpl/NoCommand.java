package headFirst06.remote.commadImpl;


import headFirst06.remote.command.Command;

/**
 * Created by wangjize on 2025/6/9.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {}

    @Override
    public void undo() {}
}
