package command.one_btn_remote;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl(){

    }

    public void setCommand(Command command){
        slot = command;
    }

    public void bthWasPressed(){
        slot.execute();
    }
}
