package headFirst06.simple.simpleControl;


import headFirst06.simple.command.Command;

/**
 * Created by wangjize on 2025/6/13.
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
