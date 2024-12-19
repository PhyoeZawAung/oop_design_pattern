package command.multiple_btn_remote;

public class StereoOffWithCDCommand implements Command{

    Stereo stereo;

    public StereoOffWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setVolume(0);
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
        stereo.setVolume(11);
        stereo.setCD();
    }
}
