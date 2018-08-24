package headfirst.factory_pattern.pizza.three;

import headfirst.factory_pattern.pizza.Pizza;

import java.util.ArrayList;

public class NYCheesePizza extends Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList topping = new ArrayList();

    public NYCheesePizza() {
        name = "chicago";
        dough = "thick";
        sauce = "asad";
        topping.add("sdfasd");
    }

    public void prepare() {

    }

    public void cut() {

    }
}
