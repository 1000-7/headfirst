package headfirst.strategy_pattern.duck.four;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        //实现呱呱叫的鸭子
        System.out.println("ggg");
    }
}
 