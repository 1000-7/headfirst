package headfirst.command.one;

public class RemoteControlTest {
    public static void main(String[] args) {
        SimpleRemoteControl remote=new SimpleRemoteControl();
        Light light=new Light();
        GarageDoor garageDoor= new GarageDoor();
        LightOnCommand lighton= new LightOnCommand(light);
        GarageDoorOpenCommand garageopen = new GarageDoorOpenCommand(garageDoor);
        remote.setSlot(garageopen);
        remote.buttonWasPressed();
        remote.setSlot(lighton);
        remote.buttonWasPressed();
    }
}
