package headfirst.proxy_pattern.three;

import java.rmi.RemoteException;

public class GumballMonitor {
    GumballMachineRemote gumballMachine;

    public GumballMonitor(GumballMachineRemote gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        try {
            System.out.println(gumballMachine.getLocation());
            System.out.println(gumballMachine.getCount());
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

}
