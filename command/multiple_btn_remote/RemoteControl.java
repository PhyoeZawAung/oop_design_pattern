package command.multiple_btn_remote;

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command lastCommand;

    public RemoteControl(){
        onCommands = new Command[7];
        offCommands = new Command[7];
        lastCommand = new NoCommand();

        for( int i = 0 ; i < 7 ; i++){
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand){
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onBtnWasPressed(int slot){
        this.onCommands[slot].execute();
        this.lastCommand = this.onCommands[slot];
    }

    public void offBtnWasPressed(int slot){
        this.offCommands[slot].execute();
        this.lastCommand = this.offCommands[slot];
    }

    public void undoBtnWasPresed(){
        this.lastCommand.undo();
    }

    public String toString(){
        StringBuffer stringBuffer = new StringBuffer();

        stringBuffer.append("\n.......... Remote Comtrol ..........\n");

        for(int i = 0 ; i < onCommands.length; i++){
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() +
                    "   " + offCommands[i].getClass().getName() + "\n");
        }

        stringBuffer.append("Last Command " + lastCommand.getClass().getName() + "\n");

        return stringBuffer.toString();
    }
}
