package headfirst.proxy.aop.first;

public class Test {
    public static void main(String[] args) {
        IHello hello = new HelloProxy(new Hello());
        hello.sayHello("szasdds");
    }
}
