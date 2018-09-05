package headfirst.command.two;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light l = new Light("l1");
        LightOnCommand l1on = new LightOnCommand(l);
        LightOffCommand l1off = new LightOffCommand(l);
        remoteControl.setCommand(0, l1on, l1off);
        remoteControl.onButtowWasPushed(0);
        remoteControl.offButtowWasPushed(0);
        remoteControl.offButtowWasPushed(0);
        remoteControl.undoButtonWasPushed();
        CeilingFan ceilingFan = new CeilingFan("living room");
        CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFan);
        CeilingFanOFFCommand ceilingFanOFFCommand = new CeilingFanOFFCommand(ceilingFan);
        remoteControl.setCommand(1, ceilingFanHighCommand, ceilingFanOFFCommand);
        remoteControl.onButtowWasPushed(1);
        remoteControl.offButtowWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}
