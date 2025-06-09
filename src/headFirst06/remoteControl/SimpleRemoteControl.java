package headFirst06.remoteControl;


import headFirst06.command.Command;

/**
 * Created by wangjize on 2025/6/9.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}
    public void setCommand(Command command) {
        this.slot = command;
    }
    public void buttonWasPressed() {
        this.slot.execute();
    }
}
