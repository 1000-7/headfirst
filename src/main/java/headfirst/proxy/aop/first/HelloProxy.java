package headfirst.proxy.aop.first;

public class HelloProxy implements IHello {
    private IHello hello;

    public HelloProxy(IHello hello) {
        this.hello = hello;
    }

    @Override
    public void sayHello(String name) {
        Logger.logging(Level.WARNING, "say hello start");
        hello.sayHello(name);
        Logger.logging(Level.INFO,"sayhello method end!!!");
    }
}
