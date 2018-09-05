package headfirst.proxy.three;

public class NoQuarterState implements State {
    transient GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("你掏钱了");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("你没放进去钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("你要先付钱");
    }

    @Override
    public void dispense() {
        System.out.println("你还没掏钱");
    }
}
