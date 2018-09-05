package headfirst.proxy.three;


public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("已经投过了");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("都已经拉杆了，怎么还能退钱");
    }

    @Override
    public void turnCrank() {
        System.out.println("杆子已经拉过了，别再拉了");
    }

    @Override
    public void dispense() {
        System.out.println("you are a winner!");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() == 0) {
            gumballMachine.setState(gumballMachine.getSoldoutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("已经卖完了");
                gumballMachine.setState(gumballMachine.getSoldoutState());
            }
        }
    }
}
