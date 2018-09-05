package headfirst.proxy.first;

public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report(){
        System.out.println(gumballMachine.location+gumballMachine.number);
    }
}
