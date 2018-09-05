package headfirst.strategy.duck.four;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        //什么都不做，不会飞
        System.out.println("i can't fly");
    }
}