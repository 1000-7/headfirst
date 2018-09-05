package headfirst.adapter.first;

public class MallardDuck implements Duck {

    @Override
    public void quack() {
        System.out.println("gua");
    }

    @Override
    public void fly() {
        System.out.println("fly 5m");
    }
}
