package headfirst.strategy_pattern.duck.four;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    //因为MallardDuck 继承了Duck，所有具有flyBehavior 与quackBehavior 实例变量
    @Override
    public void display() {
        System.out.println("mallard");
    }
}