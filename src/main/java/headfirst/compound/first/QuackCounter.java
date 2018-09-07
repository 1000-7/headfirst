package headfirst.compound.first;

/**
 * 不改变鸭子的内部实现，通过使用装饰者模式统计叫声次数，用装饰对象的模式去获得被装饰过的行为。
 */
public class QuackCounter implements Quackable {
    static int numberOfQuacks;
    Quackable quackable;

    public QuackCounter(Quackable quackable) {
        this.quackable = quackable;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        quackable.quack();
        numberOfQuacks++;
    }
}
