package command.one_btn_remote;

public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        LightOnCommand command = new LightOnCommand(new Light());
        GarageDoorOpenCommand command1 = new GarageDoorOpenCommand(new GarageDoor());
        remote.setCommand(command);

        remote.bthWasPressed();

        remote.setCommand(command1);
        remote.bthWasPressed();
    }
}
