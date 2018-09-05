package headfirst.strategy.duck.three;

//残废鸭不继承飞接口
public class DisabledDuck extends Duck implements Quackable {
    @Override
    public void display() {
        System.out.println("残废鸭的颜色...");
    }

    @Override
    public void quack() {
        //实现该方法
    }
}