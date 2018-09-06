package headfirst.proxy.aop.two;

public class Hello1 implements IHello1 {

    @Override
    public void sad(String name) {
        System.out.println("Hello " + name);
    }

    @Override
    public void happy(String name) {
        System.out.println(name + " GoodBye!");
    }

}
