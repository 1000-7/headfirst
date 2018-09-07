package headfirst.compound.two;


/**
 * 具体有子类的实现工厂决定是带计数还是不计数的
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();

    public abstract Quackable createRedheadDuck();

    public abstract Quackable createDuckCall();

    public abstract Quackable createRubberDuck();
}
