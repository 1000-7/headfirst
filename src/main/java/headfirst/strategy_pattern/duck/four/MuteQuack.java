package headfirst.strategy_pattern.duck.four;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        //什么都不做，不会叫
    }
}