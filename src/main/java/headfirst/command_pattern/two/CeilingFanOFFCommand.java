package headfirst.command_pattern.two;

public class CeilingFanOFFCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOFFCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed=ceilingFan.getSpeed();
        System.out.println(prevSpeed);
        ceilingFan.off();

    }

    @Override
    public void undo() {
        if (prevSpeed==CeilingFan.HIGH){
            ceilingFan.high();
        }else if(prevSpeed==CeilingFan.OFF){
            ceilingFan.off();
        }
    }
}