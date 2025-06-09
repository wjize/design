package headFirst06.commadImpl;


import headFirst06.command.Command;

/**
 * Created by wangjize on 2025/6/9.
 */
public class NoCommand implements Command {
    @Override
    public void execute() {}

    @Override
    public void undo() {}
}
