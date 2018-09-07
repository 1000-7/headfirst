package headfirst.compound.two;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulate(duckFactory);
    }


    /**
     * @param duckFactory 观察者模式
     */
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedheadDuck();

        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        Quackable duckCall1 = duckFactory.createDuckCall();
        Quackable duckCall2 = duckFactory.createDuckCall();
        Quackable duckCall3 = duckFactory.createDuckCall();
        Quackable duckCall4 = duckFactory.createDuckCall();
        flockOfDucks.add(duckCall1);
        flockOfDucks.add(duckCall2);
        flockOfDucks.add(duckCall3);
        flockOfDucks.add(duckCall4);
        Quacklogoist quacklogoist = new Quacklogoist();
        flockOfDucks.registerObserver(quacklogoist);
        simulate(flockOfDucks);

        System.out.println(QuackCounter.getNumberOfQuacks());
    }


    void simulate(Quackable duck) {
        duck.quack();
    }


}
