package headfirst.proxy.two;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author unclewang
 */

/**
 * 因为这个服务实现就是实现MyRemote的，所以就是implements MyRemote
 * extends UnicastRemoteObject 扩展这个类可以让你直接变成远程服务对象，具备相应的远程功能
 *
 */

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    /**
     * 扩展UnicastRemoteObject类的代价就是构造器就是也会抛出相应的异常。因为父类也是这样
     */
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "server says, 'hey'";
    }

    public static void main(String[] args) {
        try {
            /**
             * 你现在已经有远程服务了，为了让它被远程客户调用，你要将这个服务实例化，
             * 然后放进RMI registry（要保证RMI registry正在运行）
             * 注册方法就是：java.rmi.Naming类中的静态rebind()方法
             */
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
