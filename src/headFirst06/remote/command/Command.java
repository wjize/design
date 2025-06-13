package headFirst06.remote.command;


/**
 * Created by wangjize on 2025/6/9.
 */
public interface Command {
    void execute();
    void undo();
}
