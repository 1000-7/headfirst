package headfirst.strategy.duck.three;

public class MallardDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("野鸭的颜色...");
    }

    @Override
    public void fly() {
        //实现该方法
    }

    @Override
    public void quack() {
        //实现该方法
    }
}