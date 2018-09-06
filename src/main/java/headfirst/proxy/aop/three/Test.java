package headfirst.proxy.aop.three;


import headfirst.proxy.aop.two.Hello;
import headfirst.proxy.aop.two.Hello1;
import headfirst.proxy.aop.two.IHello;
import headfirst.proxy.aop.two.IHello1;

public class Test {
    public static void main(String[] args) {
        IHello hello = (IHello) new DynaProxyHello().bind(new Hello(),new LoggerOperation());
        IHello1 hello1 = (IHello1) new DynaProxyHello().bind(new Hello1(),new LoggerOperation());
        hello.sayGoogBye("Double J");
        hello.sayHello("Double J");
        hello1.sad("sdss");
    }
}