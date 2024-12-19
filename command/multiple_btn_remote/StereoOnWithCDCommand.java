package command.multiple_btn_remote;

public class StereoOnWithCDCommand implements Command{

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo){
        this.stereo = stereo;
    }

    public void execute(){
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    public void undo(){
        stereo.setVolume(0);
        stereo.setCD();
        stereo.off();
    }
}
