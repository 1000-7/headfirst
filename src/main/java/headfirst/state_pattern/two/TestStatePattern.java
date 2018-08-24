package headfirst.state_pattern.two;

public class TestStatePattern {
    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(50);
        while (gumballMachine.getCount() > 0) {
            gumballMachine.insertQuarter();
            gumballMachine.turnCrank();
            System.out.println(gumballMachine.count);
        }
    }
}
