package command.multiple_btn_remote;

import com.sun.jdi.Mirror;

public class Main {
    public static void main(String[] args) {
        // create remote controller
        RemoteControl remote = new RemoteControl();

        // creating receivers
        Light livingRoomLight = new Light("Living Room");
        Light kitchenRoomLight = new Light("Kitchen Room");
        GarageDoor door = new GarageDoor();
        Stereo stereo = new Stereo("Living Room");
        CeilingFan livingRoomCeilingFan = new CeilingFan("Living room");
        TV livingRoomTV = new TV("Living Room");

        System.out.println(remote);

        // creating commands
        Command LivingRoomLightOnCommand = new LightOnCommand(livingRoomLight);
        Command LivingRoomLightOffCommand = new LightOffCommand(livingRoomLight);

        Command KitchenRoomLightOnCommand = new LightOnCommand(kitchenRoomLight);
        Command KithckenRoomLightOffCommand = new LightOffCommand(kitchenRoomLight);

        Command stereoOnWithCDCommand = new StereoOnWithCDCommand(stereo);
        Command stereoOffWithCDCommand = new StereoOffWithCDCommand(stereo);

        Command garageDoorOpenCommand = new GarageDoorOpenCommand(door);
        Command garageDoorCloseCommand = new GarageDoorCloseCommand(door);

        Command livingRoomCeilingFanOnCommand = new CeilingFanOnCommand(livingRoomCeilingFan);
        Command livingRoomCeilingFanOffCommand = new CeilingFanOffCommand(livingRoomCeilingFan);
        Command livingRoomCeilingFanHighCommand = new CeilingFanHighCommand(livingRoomCeilingFan);

        // creating micro commands

        Command[] onCommands = {new TVOnCommand(livingRoomTV), new CeilingFanOnCommand(livingRoomCeilingFan)};
        Command[] offCommands = {new TVOffCommand(livingRoomTV), new CeilingFanOffCommand(livingRoomCeilingFan)};

        MicroCommand onMicroCommand = new MicroCommand(onCommands);
        MicroCommand offMicroCommand = new MicroCommand(offCommands);

        // add command for each remote button
        remote.setCommand(0,LivingRoomLightOnCommand, LivingRoomLightOffCommand);
        remote.setCommand(1,KitchenRoomLightOnCommand, KithckenRoomLightOffCommand);
        remote.setCommand(2,stereoOnWithCDCommand, stereoOffWithCDCommand);
        remote.setCommand(3,garageDoorOpenCommand, garageDoorCloseCommand);
        remote.setCommand(4, livingRoomCeilingFanOnCommand, livingRoomCeilingFanOffCommand);
        remote.setCommand(5, livingRoomCeilingFanHighCommand, new NoCommand());

        // add micro command to remote

        remote.setCommand(6, onMicroCommand, offMicroCommand);

        // simulate remote click 
        remote.onBtnWasPressed(0);

        System.out.println(remote);

        remote.onBtnWasPressed(1);
        remote.offBtnWasPressed(1);
        remote.undoBtnWasPresed();

        System.out.println(remote);

        remote.onBtnWasPressed(2);
        remote.undoBtnWasPresed();

        System.out.println(remote);

        remote.onBtnWasPressed(3);
        remote.offBtnWasPressed(3);

        System.out.println(remote);

        remote.onBtnWasPressed(4);

        remote.onBtnWasPressed(5);

        System.out.println(remote);

        remote.onBtnWasPressed(4);

        remote.onBtnWasPressed(6);

        remote.undoBtnWasPresed();
    }
}
