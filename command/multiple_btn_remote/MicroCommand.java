package command.multiple_btn_remote;

public class MicroCommand implements Command{
    Command[] commands;

    public MicroCommand(Command[] commands) {
        this.commands = commands;
    }

    public void execute(){
        for(int i=0 ; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    public void undo(){
        for(int i=0 ; i < commands.length; i++) {
            commands[i].undo();
        }
    }
}
