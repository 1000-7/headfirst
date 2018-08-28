package headfirst.proxy_pattern.two;

import java.rmi.Remote;
import java.rmi.RemoteException;

//Remote定义一个记号接口，利用接口扩展接口
public interface MyRemote extends Remote {
    /**
     * 所有方法必须抛出RemoteException，因为客户调用网络远程是需要网络I/O这些都是有风险的，
     * 所以直接在接口中声明异常让用户意识到这些危险
     *
     * 第二个就是远程方法的变量和返回值必须要实现Serializable接口
     */
    public String sayHello() throws RemoteException;
}
