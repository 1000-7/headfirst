package headfirst.state_pattern.two;

public class SoldOutState implements State {

    GumballMachine gumballMachine;

    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("我没了，别投了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("我没了");
    }

    @Override
    public void turnCrank() {
        System.out.println("我没了，别拉了");
    }

    @Override
    public void dispense() {
        System.out.println("我没了，不可能出来的");
    }
}
