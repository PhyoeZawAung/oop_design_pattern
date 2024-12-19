package command.multiple_btn_remote;

public class CeilingFanHighCommand implements Command{

    CeilingFan fan;
    int prevSpeed;
    public CeilingFanHighCommand(CeilingFan fan) {
        this.fan = fan;
    }

    @Override
    public void execute() {
        this.prevSpeed = fan.getSpeed();
        fan.high();
    }

    public void undo() {
        System.out.println("prev speed" + prevSpeed);
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
