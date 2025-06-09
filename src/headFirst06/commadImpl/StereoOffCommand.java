package headFirst06.commadImpl;


import headFirst06.command.Command;
import headFirst06.entity.Stereo;

/**
 * Created by wangjize on 2025/6/9.
 */
public class StereoOffCommand implements Command {
    Stereo stereo;
    public StereoOffCommand(Stereo stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
