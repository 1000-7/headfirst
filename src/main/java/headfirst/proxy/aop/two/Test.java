package headfirst.proxy.aop.two;

public class Test {
    public static void main(String[] args) {
        IHello hello = (IHello) new DynaProxyHello().bind(new Hello());
        IHello1 hello1 = (IHello1) new DynaProxyHello().bind(new Hello1());
        hello.sayGoogBye("Double J");
        hello.sayHello("Double J");
        hello1.sad("sdss");
    }
}