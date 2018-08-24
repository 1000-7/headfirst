package headfirst.strategy_pattern.duck.three;

public class RedheadDuck extends Duck implements Flyable, Quackable {
    @Override
    public void display() {
        System.out.println("红头鸭的颜色...");
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