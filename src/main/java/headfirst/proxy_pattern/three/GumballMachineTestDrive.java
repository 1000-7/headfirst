package headfirst.proxy_pattern.three;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

public class GumballMachineTestDrive {
    public static void main(String[] args) {
        GumballMachineRemote gumballMachine = null;
        int count;
        if (args.length < 2) {
            System.out.println("GumballMachine <name> <inventory>");
            System.exit(1);
        }
        try {
            count = Integer.parseInt(args[1]);
            gumballMachine = new GumballMachine(args[0], count);
            Naming.rebind("//" + "192.168.1.7" + "/gumballmachine", gumballMachine);
            while (gumballMachine.getCount() > 0) {
                ((GumballMachine) gumballMachine).insertQuarter();
                ((GumballMachine) gumballMachine).turnCrank();
                System.out.println(gumballMachine.getCount());
                Thread.sleep(2000);
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
