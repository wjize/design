package headFirst06.remoteControl;


import headFirst06.command.Command;
import headFirst06.commadImpl.NoCommand;

/**
 * Created by wangjize on 2025/6/9.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < this.onCommands.length; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        this.undoCommand = noCommand;
    }
    public void setCommand(int slot, Command oncommand, Command offcommand) {
        this.onCommands[slot] = oncommand;
        this.offCommands[slot] = offcommand;
    }
    public void onButtonWasPushed(int slot) {
        this.onCommands[slot].execute();
        undoCommand = this.onCommands[slot];
    }
    public void offButtonWasPushed(int slot) {
        this.offCommands[slot].execute();
        undoCommand = this.offCommands[slot];
    }
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toSting() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------Remote Control------\n");
        for (int i = 0; i < this.onCommands.length; i++) {
            sb.append("[slot " + i + "]: " + this.onCommands[i].getClass().getName()
                    + "    " + this.onCommands[i].getClass().getName() + "\n");
        }
        return sb.toString();
    }

}
