package headfirst.compound.first;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        duckSimulator.simulateIterator(duckFactory);
    }


    /**
     * @param duckFactory 迭代器模式加进去了
     */
    void simulateIterator(AbstractDuckFactory duckFactory) {
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
        simulate(flockOfDucks);

        System.out.println(QuackCounter.getNumberOfQuacks());
    }

    /**
     * @param duckFactory 抽象工厂添进去了
     */
    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redHeadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(gooseDuck);
        System.out.println(QuackCounter.getNumberOfQuacks());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }

    void simulate() {
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedheadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new QuackCounter(new GooseAdapter(new Goose()));
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        simulate(gooseDuck);
        System.out.println(QuackCounter.getNumberOfQuacks());
    }
}
