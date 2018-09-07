package headfirst.compound.two;

public class Quacklogoist implements Observer {
    @Override
    public void update(QuackObservable quackObservable) {
        System.out.println("log" + quackObservable.toString());
    }
}
