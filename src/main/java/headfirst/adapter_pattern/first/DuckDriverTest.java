package headfirst.adapter_pattern.first;

public class DuckDriverTest {
    private static Duck duck;

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck duckAdapter = new TurkeyAdapter(wildTurkey);
        wildTurkey.gobble();
        wildTurkey.fly();
        duckAdapter.fly();
        duckAdapter.quack();
        duck = new TurkeyAdapter(wildTurkey);
        duck.quack();
        duck.fly();
    }


}
