package headfirst.strategy_pattern.duck.four;

public class Test {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.setFlyBehavior(new FlyNoWay());
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
