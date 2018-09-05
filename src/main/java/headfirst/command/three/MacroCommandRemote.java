package headfirst.command.three;

import headfirst.command.one.GarageDoor;
import headfirst.command.one.GarageDoorOpenCommand;
import headfirst.command.two.*;

public class MacroCommandRemote {
    public static void main(String[] args) {
        Light light = new Light("living room");
        GarageDoor garageDoor = new GarageDoor();
        CeilingFan ceilingFan = new CeilingFan("sf");

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);

        Command[] on = {lightOnCommand, ceilingFanHighCommand};
        MacroCommand macroCommand = new MacroCommand(on);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, macroCommand, macroCommand);
        remoteControl.onButtowWasPushed(0);
    }
}
