package headFirst06.commadImpl;


import headFirst06.command.Command;
import headFirst06.entity.Stereo;

/**
 * Created by wangjize on 2025/6/9.
 */
public class StereoOnWithCDCommand implements Command {
    Stereo stereo;
    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.setVolume(0);
        stereo.off();
    }
}
