package command.multiple_btn_remote;

public class CeilingFanOffCommand implements Command{
    CeilingFan fan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan fan){
        this.fan = fan;
    }

    public void execute(){
        prevSpeed = fan.getSpeed();
        fan.off();
    }

    public void undo(){
        if(prevSpeed == fan.OFF) {
            fan.off();
        }else if(prevSpeed == fan.LOW){
            fan.low();
        }else if(prevSpeed == fan.MEDIUM){
            fan.medium();
        }else if(prevSpeed == fan.HIGH) {
            fan.high();
        }
    }
}
