package headfirst.strategy_pattern.duck.two;

//残废鸭,其它会飞的鸭子不用覆盖fly。
public class DisabledDuck extends Duck {
    @Override
    public void display() {
        System.out.println("残废鸭的颜色...");
    }

    @Override
    public void fly() {
        //覆盖，变成什么事都不做。
    }
} 