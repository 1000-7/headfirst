package headfirst.proxy_pattern.three;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class GumballMonitorTestDrive {
    public static void main(String[] args) throws RemoteException, NotBoundException, MalformedURLException {
        String location="rmi://192.168.1.7/gumballmachine";
        GumballMonitor gm = new GumballMonitor((GumballMachineRemote) Naming.lookup(location));
        gm.report();
    }
}
