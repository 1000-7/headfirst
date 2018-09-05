package headfirst.strategy.duck.four;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        //实现了所有有翅膀的鸭子飞行行为。
        System.out.println("i like fly");
    }
}